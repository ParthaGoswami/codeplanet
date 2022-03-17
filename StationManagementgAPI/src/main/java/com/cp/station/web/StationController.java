package com.cp.station.web;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cp.station.model.StationEntry;
import com.cp.station.service.IStationService;

@RestController
public class StationController implements IStationController{
	
	@Autowired
	private IStationService stationService;

	@Override
	@PostMapping("/entry")
	public ResponseEntity saveTrainInfo(@RequestBody StationEntry stationEntry) {		
		
		boolean status = stationService.saveStationEntry(stationEntry);
		if(!status) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok().build();
	}

}
