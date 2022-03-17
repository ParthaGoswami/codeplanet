package com.cp.station.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.station.dao.IStationRepository;
import com.cp.station.model.StationEntry;

@Service
public class StationServiceImpl implements IStationService {
	
	@Autowired
	private IStationRepository stationRepository;

	@Override
	public boolean saveStationEntry(StationEntry stationEntry) {
		
		stationEntry.setTime(LocalDateTime.now());
		Integer result = stationRepository.saveStationEntry(stationEntry);		
		return (result != null && result > 0);
	}

}
