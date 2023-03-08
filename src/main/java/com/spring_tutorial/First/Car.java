package com.spring_tutorial.First;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Override
	public String toString() {
		return "Car []";
	}

	public void drive(){
		System.out.println("Driving a car...");
	}
}
