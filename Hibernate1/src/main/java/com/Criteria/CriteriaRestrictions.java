package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.CRUD.Collage;

public class CriteriaRestrictions {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Collage.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Criteria C = S.createCriteria(Collage.class);
		
		C.add(Restrictions.eq("studentName", "Pranali"));
		
		C.add(Restrictions.between("studentId", 111, 333));
		
		List<Collage> list = C.list();
		
		for(Collage Cc : list) {
			System.out.println(Cc);
		}
	}

}
