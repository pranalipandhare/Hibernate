package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveorUpdate {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
				
		Transaction T = S.beginTransaction();
		
		Book bb = new Book(4, "Deniz", "MJ", 400);
		S.saveOrUpdate(bb);
		T.commit();
;
		}

}
