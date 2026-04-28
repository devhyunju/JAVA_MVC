package com.music.bean;

import java.util.Date;

public class Music {
	
	private String key;
	private String vocal;
	private String title;
	private String releaseComp;
	private String releaseDate;
	private Date createDate;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getVocal() {
		return vocal;
	}
	public void setVocal(String vocal) {
		this.vocal = vocal;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseComp() {
		return releaseComp;
	}
	public void setReleaseComp(String releaseComp) {
		this.releaseComp = releaseComp;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
