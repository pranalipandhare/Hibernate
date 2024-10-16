package com.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Game.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Game G = S.load(Game.class, 1);
		System.out.println(G);

	}

}
