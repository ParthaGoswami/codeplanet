package com.cp.clg.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cp.clg.model.College;

@Component
public class CollegeRowMapper implements RowMapper<College>{

	@Override
	public College mapRow(ResultSet rs, int rowNum) throws SQLException {
		College college = new College();
		college.setId(rs.getLong("id"));
		college.setCollegeName(rs.getString("college_name"));
		college.setAddress(rs.getString("address"));
		college.setStreamCount(rs.getInt("stream_count"));
		college.setStudentCount(rs.getInt("student_count"));
		return college;
	}

}
