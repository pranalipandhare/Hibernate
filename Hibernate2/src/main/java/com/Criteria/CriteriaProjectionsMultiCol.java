package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.Library.Library;

public class CriteriaProjectionsMultiCol {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Criteria C = S.createCriteria(Library.class);
		
		Projection P1 = Projections.property("Name");
		Projection P2 = Projections.property("EntryTime");
		
		ProjectionList ll = Projections.projectionList();
		ll.add(P1);
		ll.add(P2);
		C.setProjection(ll);
		
		List<Object[]> list = C.list();
		
		for(Object[] obj : list) {
			for(Object ob : obj) {
				System.out.println(ob);
			}
		}
		

	}

}
