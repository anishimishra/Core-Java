package com.java9.privatemethods;

public interface SendNotifications {
	static void sendNotifications() {
		establishConnection();
		System.out.println("sending multiple notifications");
	}

	private static void establishConnection() {
		System.out.println("Establishing a connection");
	}

	default void sendNotification() {
		System.out.println("establishing a connection");
		System.out.println("sending a notification");
	}
}
