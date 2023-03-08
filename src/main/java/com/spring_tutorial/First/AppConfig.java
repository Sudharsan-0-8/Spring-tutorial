package com.spring_tutorial.First;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring_tutorial.First")
public class AppConfig {

//	@Bean
//	public Truck getTruck(){
//		System.out.println("in getruck() in appConfig");
//		return new Truck();
//	}
	
//	@Bean
//	public Car getCar(){
//		System.out.println("in getCar() in appConfig");
//		return new Car();
//	}
	
}