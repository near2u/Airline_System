package com.demo.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.demo.bean.CountryCodes;
import com.demo.bean.UserPojo;

public interface UserService {

	boolean registerUser(UserPojo user);

	boolean checkUser(UserPojo user);

	ArrayList<CountryCodes> getCountryCodes();

	String getFlightFare(CountryCodes codes);
}
