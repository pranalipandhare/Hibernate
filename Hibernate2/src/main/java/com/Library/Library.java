package com.Library;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {

	@Id
	int id;
	String Name;
	int EntryTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEntryTime() {
		return EntryTime;
	}

	public void setEntryTime(int entryTime) {
		EntryTime = entryTime;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", Name=" + Name + ", EntryTime=" + EntryTime + "]";
	}

	public Library(int id, String name, int entryTime) {
		super();
		this.id = id;
		Name = name;
		EntryTime = entryTime;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

}
