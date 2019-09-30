package com.oswego.letterlesser.database;

/**
 * Simple static class to access credentials through other classes.
 * 
 * @author Jimmy Nguyen
 * @since 09/18/2019
 */

public class Settings {

	public static final String DATABASE_SCHEMA = "";
	public static final String DATABASE_USERNAME = "";
	public static final String DATABASE_PASSWORD = "";
	public static final String DATABASE_HOST = "pi.cs.oswego.edu";
	public static final String DATABASE_PORT = "3306";

	public static final String[] DATABASE_TABLES = new String[] { "email", "email_addr", "filter_settings", "folder",
			"label", "label_list", "received_email", "recipient_list", "user", "user_favourites", "sentiment_score" };
	
}