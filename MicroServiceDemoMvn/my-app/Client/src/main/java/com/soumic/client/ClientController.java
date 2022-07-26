package com.soumic.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j  // for logging
@RestController  // rest
@RequestMapping("api/v1/clients")  // starts with this url pattern
public record ClientController(ClientService clientService) {

  @PostMapping
  public void registerClient(@RequestBody ClientRegistrationRequest clientRegistrationRequest) {
    log.info("new client registration {}", clientRegistrationRequest);
    clientService.registerClient(clientRegistrationRequest); // api request e input, seta clientService ke dibo
  }
}
