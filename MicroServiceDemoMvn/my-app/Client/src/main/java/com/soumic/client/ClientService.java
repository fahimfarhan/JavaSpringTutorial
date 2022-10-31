package com.soumic.client;

import org.springframework.stereotype.Service;

@Service
public record ClientService() {
  public void registerClient(ClientRegistrationRequest request) {
    Client client =
        Client.builder()
        .firstName(request.firstName())
        .lastName(request.lastName())
        .email(request.email())
        .build();

    // now we want to save it in a db. so add some db code...
  }
}
