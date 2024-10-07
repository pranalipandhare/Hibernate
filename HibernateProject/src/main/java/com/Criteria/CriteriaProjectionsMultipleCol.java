package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.operation.Book;

public class CriteriaProjectionsMultipleCol {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Criteria C = S.createCriteria(Book.class);

		Projection P1 = Projections.property("nameBook");
		Projection P2 = Projections.property("priceBook");
		ProjectionList plist = Projections.projectionList();
		plist.add(P1);
		plist.add(P2);
		C.setProjection(plist);

//		multiple columns so use object array
		List<Object[]> list = C.list();

		for (Object[] s : list) {
			for (Object b : s) {
				System.out.println(b );
			}

		}
	}

}
