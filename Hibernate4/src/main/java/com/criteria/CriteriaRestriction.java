package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.project.Game;

public class CriteriaRestriction {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Game.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Criteria C = S.createCriteria(Game.class);

		C.add(Restrictions.eq("id", 1));

		List<Game> list = C.list();

		for (Game G : list) {
			System.out.println(G);
		}

	}

}
