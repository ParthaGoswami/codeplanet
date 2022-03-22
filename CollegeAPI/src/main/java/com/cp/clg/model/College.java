package com.cp.clg.model;

public class College {
	
	private Long id;
	private String collegeName;
	private String address;
	private Integer studentCount;
	private Integer StreamCount;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(Integer studentCount) {
		this.studentCount = studentCount;
	}
	public Integer getStreamCount() {
		return StreamCount;
	}
	public void setStreamCount(Integer streamCount) {
		StreamCount = streamCount;
	}
	
	

}
