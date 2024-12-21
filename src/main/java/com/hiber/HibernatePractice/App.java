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
    	
    	
    	session.save(emp);
    	tx.commit();
    	session.close();
    	System.out.println("Record save sussessfully");
    	
    	
    }
    
    
}
