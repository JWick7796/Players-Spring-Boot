package com.pubg.players.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String userName;

	private int highestKills;

	public Profile() {
	}

	public Profile(String userName, int highestKills) {
		this.userName = userName;
		this.highestKills = highestKills;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getHighestKills() {
		return highestKills;
	}

	public void setHighestKills(int highestKills) {
		this.highestKills = highestKills;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", userName=" + userName + ", highestKills=" + highestKills + "]";
	}
}
