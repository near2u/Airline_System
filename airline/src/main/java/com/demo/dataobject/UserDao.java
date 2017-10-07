package com.demo.dataobject;

import java.util.ArrayList;
import java.util.HashMap;

import com.demo.bean.CountryCodes;
import com.demo.bean.UserPojo;

public interface UserDao {

	boolean insertData(UserPojo user);

	boolean checkUser(UserPojo user);

	ArrayList<CountryCodes> getCountryCodes();

	String getFare(CountryCodes codes);

}
