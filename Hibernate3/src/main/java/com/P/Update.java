package com.P;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(House.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Transaction T = S.beginTransaction();

		House H = new House(103, "Fam-Gam", 6, 5);
		S.update(H);
		T.commit();
	}

}
