package com.spring_tutorial.First;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App 
{
	
	@Autowired
	@Qualifier("truck")
	Vehicle truckObj; 

	public Vehicle getTruckObj() {
		return truckObj;
	}


	public void setTruckObj(Vehicle truckObj) {
		truckObj.drive();
		this.truckObj = truckObj;
	}

	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
    	// hard code way to create object of type vehicle  it will be difficult to change from Bike to Car
    	// tight coupling
//    	Vehicle obj = new Bike();
    	
    	// loose coupling - can be achieved by xml file - We can use BeanFactory or ApplicationContext
    	ApplicationContext context = new ClassPathXmlApplicationContext("Map.xml");
    	
    	// using xml to get the bean  -- see xml
    	Vehicle obj1 = (Vehicle) context.getBean("vehicle");
    	
    	// using annotations to get the bean  -- see xml
    	Vehicle obj2 = (Vehicle) context.getBean("car");
    	
    	// using JAVA - annotations (AppConfig)
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
//    	Vehicle obj3 = (Vehicle) factory.getBean(Vehicle.class);
    	Vehicle obj3 = (Vehicle) factory.getBean(Bike.class);
    	
    	

    	
     	obj1.drive();
    	System.out.println(obj1); //to show implementation of property-tag in xml
    	
    	obj2.drive();
    	obj3.drive();
    	
    	System.out.println(new App().getTruckObj());
    	
    	// to show the implementation of @Qualifier  
//    	App a =(App) factory.getBean("app");
//    	a.obj3.drive();
    	
    }
	
	// to show the implementation @Qualifier
	


}