package com.cp.station.model;

public class Train {
	
	private Long trainId;
	private String trainName;
	private String trainType;
	private Integer coaches;
	
	
	public Long getTrainId() {
		return trainId;
	}
	public void setTrainId(Long trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public Integer getCoaches() {
		return coaches;
	}
	public void setCoaches(Integer coaches) {
		this.coaches = coaches;
	}
	
	
	

}
