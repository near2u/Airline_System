package com.demo.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.bean.CountryCodes;
import com.demo.bean.UserPojo;
import com.demo.dataobject.UserDao;
import com.demo.jdbcrow.mapper.CountryCodeMapper;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean insertData(UserPojo user) {
		// TODO Auto-generated method stub

		String sql = "insert into userdata(firstname, lastname, username, password, contact, email)"
				+ "values(?,?,?,?,?,?)";

		jdbcTemplate = new JdbcTemplate(dataSource);
		int row = jdbcTemplate.update(sql, new Object[] { user.getFirstName(), user.getLastName(), user.getUserName(),
				user.getPassword(), user.getContact(), user.getEmail() });

		if (row > 0) {
			return true;
		}

		return false;
	}

	@Override
	public boolean checkUser(UserPojo user) {
		// TODO Auto-generated method stub

		jdbcTemplate = new JdbcTemplate(dataSource);
		int row = jdbcTemplate.queryForInt("select count(*) from userdata where username= ? and" + " password=?",
				user.getUserName(), user.getPassword());

		if (row > 0) {
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<CountryCodes> getCountryCodes() {
		// TODO Auto-generated method stub

		ArrayList<CountryCodes> codes = null;
		String sql = "select * from airport";
		jdbcTemplate = new JdbcTemplate(dataSource);
		codes = (ArrayList<CountryCodes>) jdbcTemplate.query(sql, new CountryCodeMapper());

		return codes;
	}

	@Override
	public String getFare(CountryCodes codes) {
		// TODO Auto-generated method stub
		System.out.println(codes.getDeptCode() + "" + codes.getDestCode());
		String sql = "select flight_number from flight where departure_airport_code = ? and arrival_airport_code = ? limit 1";
		jdbcTemplate = new JdbcTemplate(dataSource);

		String flightNumber = jdbcTemplate.queryForObject(sql,
				new Object[] { codes.getDeptCode(), codes.getDestCode() }, String.class);
		sql = "select amount from fare where flight_number = ?";
		System.out.println("Flight Number" + flightNumber);
		String fare = jdbcTemplate.queryForObject(sql, new Object[] { flightNumber }, String.class);
		return fare;
	}

}
