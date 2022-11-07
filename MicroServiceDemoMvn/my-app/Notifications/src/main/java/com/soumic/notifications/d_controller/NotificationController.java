package com.soumic.notifications.d_controller;

import com.soumic.notifications.a_model.NotificationModel;
import com.soumic.notifications.a_model.NotificationRequest;
import com.soumic.notifications.c_service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/notifications")
public record NotificationController(NotificationService notificationService) {

  @PostMapping("/create")
  void createNotification(NotificationRequest notificationRequest) {
    log.info("creating notification: "+notificationRequest);
    notificationService.registerNewNotification(notificationRequest);
  }


  @GetMapping("/all_notifications")
  List<NotificationModel> getAllNotifications() {
    return notificationService.getAllNotifications();
  }

}
