package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.P.House;

public class CriteriaProjections {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(House.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Criteria C = S.createCriteria(House.class);

		Projection P = Projections.property("HouseName");
		C.setProjection(P);
		
		List<String> list = C.list();
		
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
