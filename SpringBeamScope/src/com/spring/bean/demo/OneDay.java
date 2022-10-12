package com.spring.bean.demo;

import org.springframework.stereotype.Component;

@Component
public class OneDay implements Cricket {

	@Override
	public String getTimeTable() {
	
		return "Today is a One Day match";
	}

}
