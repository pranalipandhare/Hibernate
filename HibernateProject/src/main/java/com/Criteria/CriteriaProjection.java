package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.operation.Book;

public class CriteriaProjection {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Criteria C = S.createCriteria(Book.class);

		Projection P1 = Projections.property("idBook");
		C.setProjection(P1);

		List<Integer> list = C.list();

		for (Integer B : list) {
			System.out.println(B); 
		}

	}

}
