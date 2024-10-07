package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.P.House;

public class CriteriaProjectionsMultiCol {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(House.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Criteria C = S.createCriteria(House.class);
		Projection p1 = Projections.property("HouseName");
		Projection p2 = Projections.property("HouseMembers");
		ProjectionList plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		C.setProjection(plist);
		
		List<Object[]> list = C.list();
		
		for(Object[] o : list) {
			for(Object O : o) {
				System.out.println(O);
			}
		}
		
		
		
	}

}
