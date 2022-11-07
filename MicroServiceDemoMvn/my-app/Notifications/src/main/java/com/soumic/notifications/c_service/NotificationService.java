package com.soumic.notifications.c_service;

import com.soumic.notifications.a_model.NotificationModel;
import com.soumic.notifications.a_model.NotificationRequest;
import com.soumic.notifications.b_repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record NotificationService(NotificationRepository notificationRepository) {

  public void registerNewNotification(NotificationRequest notificationRequest) {
    // create a notificationModel
    var notificationModel = NotificationModel
        .builder()
        .title(notificationRequest.title())
        .subTitle(notificationRequest.subTitle())
        .build();

    // insert into db
    notificationRepository.save(notificationModel);
  }

  public List<NotificationModel> getAllNotifications() {
    return notificationRepository.findAll();
  }
}
