package org.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.add(100)
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		//Employee emp = (Employee) context.getBean("emp1");
		Employee emp1= (Employee) context.getBean("emp");
		//Loose coupling
		//TestEmp t1 = (TestEmp) context.getBean("emp");
		//System.out.println(emp);
		System.out.println(emp1);
		ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
		Address add = (Address) context1.getBean("add");
		System.out.println(add);
		
		
	}

}
