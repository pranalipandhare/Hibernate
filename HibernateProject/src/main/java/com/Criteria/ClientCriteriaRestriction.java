package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.operation.Book;

public class ClientCriteriaRestriction {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Criteria C = S.createCriteria(Book.class);

//		Select * from book where namebook = "Sanem"
		C.add(Restrictions.eq("nameBook", "Sanem"));

		C.add(Restrictions.between("idBook", 1, 3));

		List<Book> list = C.list();

		for (Book B : list) {
			System.out.println(B);
		}

	}

}
