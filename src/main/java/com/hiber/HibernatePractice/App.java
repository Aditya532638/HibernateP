package com.hiber.HibernatePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Employee emp=new Employee(1,"Aditya","IT",40000);

    	
    	Configuration config=new Configuration();
    	config.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=config.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	
//    	session.save(emp);
    	
    	System.out.println("Record save sussessfully");
    	
//    	get data
//    	
  	Employee e1=session.get(Employee.class,1);
   	
   	System.out.println(e1);
   	
   	
//	Employee e1=session.get(Employee.class, 1);
//
//    e1.setEName("Aditya");
//	e1.setESalary(60);
//	session.update(e1);
//	
//	System.out.println("update sussessfully");
	
//	
//	Employee e1=session.get(Employee.class, 1);
//	session.delete(e1);
    	
    	
    	
    	
    	tx.commit();
    	session.close();
    	
    	
    	
    	
    }
    
    
}
