package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	int id;
	String Name;
	String PlayerName;

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

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", Name=" + Name + ", PlayerName=" + PlayerName + "]";
	}

	public Game(int id, String name, String playerName) {
		super();
		this.id = id;
		Name = name;
		PlayerName = playerName;
	}

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

}
