package com.demo.myapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.CountryCodes;
import com.demo.bean.UserBeans;
import com.demo.bean.UserPojo;
import com.demo.service.UserService;

@Controller
public class RegisterController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String redirect(Locale locale, Model model) {
		return "registration";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerDetails(@Validated UserPojo user, Model model) {

		/*
		 * model.addAttribute("firstName", user.getFirstName());
		 * model.addAttribute("lastName", user.getLastName());
		 * model.addAttribute("user", user.getUser()); model.addAttribute("password",
		 * user.getPassword()); model.addAttribute("email", user.getEmail());
		 */
		userService.registerUser(user);
		model.addAttribute("message", "User register successfully");

		return "registration";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String redirectToLogin(@Validated UserPojo user, Model model) {

		return "login";
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public String loginPage(@Validated UserPojo user, Model model) {

		System.out.println("user" + user.getUserName() + " " + user.getPassword());
		boolean userExist = userService.checkUser(user);

		if (userExist) {
			System.out.println("User Exist!!!");
			model.addAttribute("user", user.getUserName());
			return "/home";
		}

		return "login";
	}

	@RequestMapping(value = "/flight", method = RequestMethod.GET)
	public ModelAndView homePage(CountryCodes country) {
		// model.addAttribute("userName", user.getUserName());
		List<CountryCodes> countryCodes = userService.getCountryCodes();
		/* model.addAttribute("codes", countryCodes); */

		ModelAndView mv = new ModelAndView("FlightDetails");
		/*
		 * List<String> test = new ArrayList<String>(); test.add("Human Resources");
		 * test.add("Finance"); test.add("Admin"); test.add("Quality Assurance");
		 * test.add("Products");
		 */

		mv.addObject("test", countryCodes);
		return mv;
	}

	@RequestMapping(value = "/getFare", method = RequestMethod.POST)
	public ModelAndView getFlightFare(@Validated CountryCodes codes, Model model) {
		System.out.println(codes.getDeptCode() + "" + codes.getDestCode());
		String fare = userService.getFlightFare(codes);
		System.out.println(fare);
		List<CountryCodes> countryCodes = userService.getCountryCodes();
		ModelAndView mv = new ModelAndView("FlightDetails");
		mv.addObject("test", countryCodes);
		mv.addObject("fare", fare);
		return mv;

	}

}
