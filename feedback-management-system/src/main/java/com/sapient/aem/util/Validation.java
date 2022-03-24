package com.sapient.aem.util;
import java.util.regex.Pattern;

public class Validation {

	public static Boolean isName(String name) {

		return Pattern.matches("[a-zA-Z]+", name);

	}
	
	public static Boolean isPassword(String password) {

		return Pattern.matches("[a-zA-Z_]+[@][0-9]{2,5}", password);

	}
	
	public static Boolean isRole(String role) {

		return Pattern.matches("[A-R]+", role);

	}

	public static Boolean isMobileNumber(Long mobile) {
		String mobileNo = mobile.toString();
		return Pattern.matches("[98][0-9]{9}", mobileNo); 

	}

	public static Boolean isEmail(String name) {
		return Pattern.matches("[a-zA-Z0-9_\\.]+[@][a-zA-Z]+[//.][a-zA-Z]{2,3}", name);
	}

	public static Boolean isAdharCard(Long adhar) {
		String adharCard = adhar.toString();
		return Pattern.matches("[0-9]{12}+", adharCard);
	}

}
