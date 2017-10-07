package com.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.bean.CountryCodes;
import com.demo.bean.UserPojo;
import com.demo.dataobject.UserDao;
import com.demo.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Autowired
	public void setDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean registerUser(UserPojo user) {
		// TODO Auto-generated method stub
		printLogs(user);
		return userDao.insertData(user);

	}

	private void printLogs(UserPojo user) {
		System.out.println("Printing Log: Inserted User: " + user.getFirstName() + " " + user.getLastName() + " "
				+ user.getUserName() + " " + user.getPassword() + " " + user.getEmail() + " " + user.getContact());

	}

	@Override
	public boolean checkUser(UserPojo user) {
		// TODO Auto-generated method stub

		return userDao.checkUser(user);
	}

	@Override
	public ArrayList<CountryCodes> getCountryCodes() {
		// TODO Auto-generated method stub
		return userDao.getCountryCodes();
	}

	@Override
	public String getFlightFare(CountryCodes codes) {
		// TODO Auto-generated method stub
		return userDao.getFare(codes);
	}

}
