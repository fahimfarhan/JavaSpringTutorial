package com.soumic.spam;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j  // for logging
@RestController  // rest
@RequestMapping("api/v1/spam_check")  // starts with this url pattern
@AllArgsConstructor
public class SpamController {

  private final SpamService spamService;

  @GetMapping(path = "{clientId}")
  public SpamCheckResponse isSpam(Integer client) {
    boolean isSpamClient = spamService.isSpamClient(client);

    return new SpamCheckResponse(isSpamClient);
  }
}
