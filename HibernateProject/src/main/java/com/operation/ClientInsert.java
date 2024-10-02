package com.operation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsert {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory Sf = cfg.buildSessionFactory();
		Session session= Sf.openSession();
		
		Transaction T = session.beginTransaction();
		Book b1 = new Book(203, "MERN", "KD", 900);
		session.save(b1);
		T.commit();
		
	}

}
