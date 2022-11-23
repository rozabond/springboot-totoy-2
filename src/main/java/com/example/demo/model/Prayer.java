package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prayer")
public class Prayer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstNames;
	
	@Column(name = "prayer_content")
	private String prayerContent;
	
	@Column(name = "prayer_title")
	private String prayerTitle;
	
	public Prayer() {
		
	}
	
	public Prayer(String Name, String Content, String Title) {
		super();
		this.firstNames = Name;
		this.prayerContent = Content;
		this.prayerTitle = Title;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstNames;
	}
	public void setFirstName(String firstName) {
		this.firstNames = firstName;
	}

	public String getprayerContent() {
		return prayerContent;
	}
	public void setprayerContent(String prayerContent) {
		this.prayerContent = prayerContent;
	}
	public String getprayerTitle() {
		return prayerTitle;
	}
	public void setprayerTitle(String prayerTitle) {
		this.prayerTitle = prayerTitle;
	}
	
}