package com.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Collage.class);
		SessionFactory cf = cfg.buildSessionFactory();
		Session s = cf.openSession();

		Collage st = s.load(Collage.class, 222);
		System.out.println(st);

	}

}
