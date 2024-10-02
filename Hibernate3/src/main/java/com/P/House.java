package com.P;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class House {

	@Id
	int HouseNo;
	String HouseName;
	int HouseRooms;
	int HouseMembers;

	public int getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(int houseNo) {
		HouseNo = houseNo;
	}

	public String getHouseName() {
		return HouseName;
	}

	public void setHouseName(String houseName) {
		HouseName = houseName;
	}

	public int getHouseRooms() {
		return HouseRooms;
	}

	public void setHouseRooms(int houseRooms) {
		HouseRooms = houseRooms;
	}

	public int getHouseMembers() {
		return HouseMembers;
	}

	public void setHouseMembers(int houseMembers) {
		HouseMembers = houseMembers;
	}

	@Override
	public String toString() {
		return "House [HouseNo=" + HouseNo + ", HouseName=" + HouseName + ", HouseRooms=" + HouseRooms
				+ ", HouseMembers=" + HouseMembers + "]";
	}

	public House(int houseNo, String houseName, int houseRooms, int houseMembers) {
		super();
		HouseNo = houseNo;
		HouseName = houseName;
		HouseRooms = houseRooms;
		HouseMembers = houseMembers;
	}

	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

}
