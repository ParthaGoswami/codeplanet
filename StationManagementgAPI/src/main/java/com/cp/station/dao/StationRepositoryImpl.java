package com.cp.station.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cp.station.model.StationEntry;

@Repository
public class StationRepositoryImpl implements IStationRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	private String INSERT_STATION_ENTRY = "insert into station_entry  (train_id, type, time)  values (? , ? , ? )";
	
//	public StationRepositoryImpl(JdbcTemplate jdbcTemplate) {
//			this.jdbcTemplate = jdbcTemplate;
//	}

	@Override
	public Integer saveStationEntry(StationEntry stationEntry) {
		
		return jdbcTemplate.update(INSERT_STATION_ENTRY , stationEntry.getTrainId(), 
				stationEntry.getType(), 
				stationEntry.getTime()
		);

	
	}

}
