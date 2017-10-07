package com.demo.jdbcrow.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.CountryCodes;

public class CountryCodeExtractor {

	public CountryCodes extractRows(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		CountryCodes codes = new CountryCodes();
		codes.setCode(rs.getString(1));
		codes.setAirport(rs.getString(2));
		return codes;
	}

}
