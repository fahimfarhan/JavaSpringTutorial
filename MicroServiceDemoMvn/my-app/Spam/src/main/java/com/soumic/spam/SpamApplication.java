package com.soumic.spam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpamApplication {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    SpringApplication.run(SpamApplication.class, args);
  }
}