package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.project.Game;

public class CriteriaProjections {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Game.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Criteria C = S.createCriteria(Game.class);
		Projection P = Projections.property("PlayerName");
		C.setProjection(P);
		
		List<String> list = C.list();
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
