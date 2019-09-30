package com.oswego.letterlesser.database;

public class DBdemo {

	public static void main(String[] args) {
		Database.truncateTables();
		Database.insertDummyData();
		Database.pull();
		Database.showTables();
		Database.fetchFavourites("first@gmail.com");
		
		Database.getLabels();
	}

} 