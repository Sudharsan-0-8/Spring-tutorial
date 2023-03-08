package com.spring_tutorial.First;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	private String model;
	
	@Autowired 		// if @Autowired is not used then tyre object will be null 
	public Tyre tyre;
	
	// to show implememntation of <constructor-arg value="Enfield">
//	public Bike(String model) {
//		super();
//		this.model = model;
//	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", tyre=" + tyre + "]";
	}

	public void drive(){
		
		System.out.println("Riding a bike...");
	}
}
