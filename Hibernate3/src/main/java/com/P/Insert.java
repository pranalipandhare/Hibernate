package com.P;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(House.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Transaction T = S.beginTransaction();

		House H = new House(105, "StarFamily", 6, 4);
		S.save(H);
		T.commit();

	}

}
