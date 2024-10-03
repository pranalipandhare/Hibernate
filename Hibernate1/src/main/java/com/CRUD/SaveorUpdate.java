package com.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveorUpdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Collage.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Transaction T = S.beginTransaction();

		Collage C = new Collage(55, "keshav", "Beed", "civil");
		S.saveOrUpdate(C);
		T.commit();

	}

}
