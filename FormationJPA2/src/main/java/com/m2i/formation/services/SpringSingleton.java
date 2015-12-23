package com.m2i.formation.services;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSingleton {
	
	private static  ApplicationContext beanfactory= null; 
	
	public static  ApplicationContext getInstance()  {

		if ( beanfactory== null) {
			
			beanfactory = new ClassPathXmlApplicationContext("spring.xml");
		}
		return beanfactory;
	}

	private SpringSingleton() {
		
	}
}
