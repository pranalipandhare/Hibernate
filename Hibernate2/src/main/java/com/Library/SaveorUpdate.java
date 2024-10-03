package com.Library;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveorUpdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Transaction T = S.beginTransaction();

		Library L = new Library(4, "Pranjal", 3);
		S.saveOrUpdate(L);
		T.commit();

	}

}
