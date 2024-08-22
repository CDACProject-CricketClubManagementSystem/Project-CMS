package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Notifications;


@Repository
public interface NotificationRepository extends JpaRepository<Notifications,Long> {

	List<Notifications> findByIsReadFalse();

}
