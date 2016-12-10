package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.setFirstName("Rama");
		
		Configuration c1= new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		System.out.println("done");

	}

}
