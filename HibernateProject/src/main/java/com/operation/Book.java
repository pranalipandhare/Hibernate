package com.operation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	int idBook;
	String nameBook;
	String AuthorBook;
	int priceBook;

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getAuthorBook() {
		return AuthorBook;
	}

	public void setAuthorBook(String authorBook) {
		AuthorBook = authorBook;
	}

	public int getPriceBook() {
		return priceBook;
	}

	public void setPriceBook(int priceBook) {
		this.priceBook = priceBook;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", nameBook=" + nameBook + ", AuthorBook=" + AuthorBook + ", priceBook="
				+ priceBook + "]";
	}

	public Book(int idBook, String nameBook, String authorBook, int priceBook) {
		super();
		this.idBook = idBook;
		this.nameBook = nameBook;
		AuthorBook = authorBook;
		this.priceBook = priceBook;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

}
