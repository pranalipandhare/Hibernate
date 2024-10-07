package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.Library.Library;

public class CriteriaProjections {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Criteria C = S.createCriteria(Library.class);
		
		Projection P = Projections.property("EntryTime");
		C.setProjection(P);
		
		List<Integer> list = C.list();
		
		for(Integer I : list) {
			System.out.println(I);
		}
	}

}
