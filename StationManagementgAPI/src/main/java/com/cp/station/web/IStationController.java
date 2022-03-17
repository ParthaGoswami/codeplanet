package com.cp.station.web;

import org.springframework.http.ResponseEntity;

import com.cp.station.model.StationEntry;

public interface IStationController {
	
	public ResponseEntity<Void> saveTrainInfo(StationEntry stationEntry);

}
