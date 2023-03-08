package com.spring_tutorial.First;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// to  show the implementation Dependency-Injection using java (AppConfig)

//@Repository("truck")
@Component("truck")
public class Truck implements Vehicle{
	
	Truck(){
		System.out.println("Truck Constructor");
	}
	
	public void drive(){
		System.out.println("Driving a Truck...");
	}
	
}
