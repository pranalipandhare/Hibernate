package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.Library.Library;

public class CriteriaRestrictions {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session S = sf.openSession();
		
		Criteria C = S.createCriteria(Library.class);
		
		C.add(Restrictions.eq("Name", "Om"));
		C.add(Restrictions.between("Name", "Harsh", "Om"));
		
		List<Library> list = C.list();
		
		for(Library L : list) {
			System.out.println(L);
		}
		
	}

}
