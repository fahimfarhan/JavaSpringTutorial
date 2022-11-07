package com.soumic.notifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationApplication {
  public static void main(String[] Args) {
    System.out.println("Hello world from Notifications!");
    SpringApplication.run(NotificationApplication.class, Args);
  }
}