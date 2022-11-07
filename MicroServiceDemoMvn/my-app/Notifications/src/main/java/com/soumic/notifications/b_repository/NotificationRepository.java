package com.soumic.notifications.b_repository;

import com.soumic.notifications.a_model.NotificationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationModel, Integer> { }
