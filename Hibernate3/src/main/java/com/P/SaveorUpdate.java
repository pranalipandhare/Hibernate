package com.P;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveorUpdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(House.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Transaction T = S.beginTransaction();
		
		House hh = new House(104, "OM", 6, 5);
		S.saveOrUpdate(hh);
		T.commit();

	}

}
