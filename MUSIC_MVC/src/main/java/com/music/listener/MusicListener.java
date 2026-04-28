package com.music.listener;

import java.util.ArrayList;

import com.music.bean.Music;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MusicListener implements ServletContextListener {

	@Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("MusicListener.contextInitialized");
        sce.getServletContext().setAttribute("musicList", new ArrayList<Music>());
    }

}
