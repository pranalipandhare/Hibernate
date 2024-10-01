package com.Library;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session S  = sf.openSession();
		
		Library L = S.load(Library.class, 1);
		System.out.println(L);

	}

}
