package com.soumic.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j  // for logging
@RestController  // rest
@RequestMapping("api/v1/clients")  // starts with this url pattern
public record ClientController(ClientService clientService) {

  public void registerClient(ClientRegistrationRequest clientRegistrationRequest) {
    log.info("new client registration {}", clientRegistrationRequest);
  }
}
