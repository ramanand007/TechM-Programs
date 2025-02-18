package com.examples;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeRunner {
public static void main(String args[]) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	
	EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
	
	int status=dao.saveEmployee(new Employee(121,"Ramanand",100000));
	System.out.println("Row Inserted Successfully" +status);
	
  }
}
