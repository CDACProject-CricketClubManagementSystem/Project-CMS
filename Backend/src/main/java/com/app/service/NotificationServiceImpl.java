package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Notifications;
import com.app.repository.NotificationRepository;

@Service
public class NotificationServiceImpl implements NotificationService{

	@Autowired
    private NotificationRepository notificationRepository;

    public void createNotification(String userName, String message) {
        Notifications notification = new Notifications();
        notification.setUserName(userName);
        notification.setMessage(message);
        notificationRepository.save(notification);
    }
    
    public List<Notifications> getUnreadNotifications() {
        return notificationRepository.findByIsReadFalse();
    }
	
}
