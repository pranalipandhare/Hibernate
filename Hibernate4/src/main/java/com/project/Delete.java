package com.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Game.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Transaction T = S.beginTransaction();
		
		Game G = new Game(4, "Chess", "Ankita");
		S.delete(G);
		T.commit();
		
	}

}
