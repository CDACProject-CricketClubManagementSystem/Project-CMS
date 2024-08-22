package com.app.service;

import java.util.List;

import com.app.entities.Notifications;

public interface NotificationService {

	void createNotification(String username, String message);

	List<Notifications> getUnreadNotifications();

}
