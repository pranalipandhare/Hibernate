package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Transaction T = S.beginTransaction();

		Book B = new Book(203, "Daniz", "MJ", 400);
		S.update(B);
		T.commit();

		System.out.println("Updated");

	}

}
