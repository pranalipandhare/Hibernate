package com.P;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(House.class);
		SessionFactory SF = cfg.buildSessionFactory();
		Session S = SF.openSession();

		House H = S.load(House.class, 101);
		System.out.println(H);

	}

}
