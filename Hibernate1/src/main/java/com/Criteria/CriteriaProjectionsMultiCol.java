package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.CRUD.Collage;

public class CriteriaProjectionsMultiCol {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Collage.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Criteria C = S.createCriteria(Collage.class);

		Projection P1 = Projections.property("studentName");
		Projection P2 = Projections.property("studentCity");
		Projection P3 = Projections.property("studentdept");

		ProjectionList Pl = Projections.projectionList();
		Pl.add(P1);
		Pl.add(P2);
		Pl.add(P3);
		C.setProjection(Pl);

		List<Object[]> list = C.list();

		for (Object[] O : list) {
			for (Object o : O) {
				System.out.println(o);
			}
		}

	}

}
