package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.operation.Book;

public class ClientCriteria {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Book Bb = s.load(Book.class, 4);

//		criteria query means : select * from book [by using c object]
//		we want to fetch data from book class so we write Book.class
		Criteria c = s.createCriteria(Book.class);

//		List() method of criteria execute the Select * from Book
		List<Book> list = c.list();

		for (Book b : list) {
			System.out.println(b);
		}

	}

}
