package com.demo.jdbcrow.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.bean.CountryCodes;

public class CountryCodeMapper implements RowMapper<CountryCodes> {
	@Override
	public CountryCodes mapRow(ResultSet rs, int line) throws SQLException {
		// TODO Auto-generated method stub
		// System.out.println("hiiii");
		CountryCodeExtractor extract = new CountryCodeExtractor();
		return extract.extractRows(rs);
	}

}
