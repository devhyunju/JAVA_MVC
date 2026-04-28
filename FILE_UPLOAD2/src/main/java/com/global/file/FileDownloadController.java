package com.global.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/file/download")
public class FileDownloadController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings({ "unchecked" })
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FileDownloadController.doGet");
		req.setCharacterEncoding("utf-8");
		resp.setContentType("application/octet-stream;charset=utf-8" );
		HashMap<String, String> fileMap = (HashMap<String, String>)req.getServletContext().getAttribute("fileMap");
		String uploadPath = ((Properties)req.getServletContext().getAttribute("appConfig")).getProperty("file.upload.path");
		String reqFileName = req.getParameter("fileName");
		String orgFileName = fileMap.get(reqFileName);
		String downloadFileFullPath = uploadPath + reqFileName; 
		File file = new File(downloadFileFullPath);
		resp.setHeader("Cache-Control","no-cache");
		resp.addHeader("Content-disposition", "attachment; filename*UTF-8''" + URLEncoder.encode(orgFileName, "UTF-8").replaceAll("\\+", "%20"));
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buffer = new byte[1024*8];
		ServletOutputStream outputStream = resp.getOutputStream();
		while( true ) {
			int count = fileInputStream.read(buffer);
			if( -1 == count ) { break; }
			outputStream.write(buffer, 0, count);
			
		}
		fileInputStream.close();
		outputStream.close();
	}
}
