package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.P.House;

public class CriteriaRestriction {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(House.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();

		Criteria C = S.createCriteria(House.class);
		
		C.add(Restrictions.eq("HouseName", "Family"));
		
		C.add(Restrictions.between("HouseNo", 101, 103));

		List<House> list = C.list();

		for (House H : list) {
			System.out.println(H);
		}
	}

}
