package com.org.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {
	public List<String> getWelcomeMsg(String name) {
		List<String> myWelcomeMsg = new ArrayList<>();
		
		//Adding data to the list
		myWelcomeMsg.add("Hello! ");
		myWelcomeMsg.add(name);
		myWelcomeMsg.add(", Welcome to the spring Course :-)");
		
		return myWelcomeMsg;
		
	}
}
