package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory cf = cfg.buildSessionFactory();
		Session s = cf.openSession();
//		update, load, delete, updateorSAve methods are comes from session and session comes from session factory
		
		Book b1 = s.load(Book.class, 1);
		System.out.println(b1);
	 }

}
