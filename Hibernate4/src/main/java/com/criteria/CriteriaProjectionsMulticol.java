package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.project.Game;

public class CriteriaProjectionsMulticol {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Game.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Criteria C = S.createCriteria(Game.class);
		
		Projection P1 = Projections.property("id");
		Projection P2 = Projections.property("Name");
		ProjectionList P = Projections.projectionList();
		P.add(P1);
		P.add(P2);
		C.setProjection(P);
		
		List<Object[]> list = C.list();
		
		for(Object[] O : list) {
			for(Object op : O) {
				System.out.println(op);
			}
		}
	}

}
