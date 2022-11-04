package com.soumic.spam;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class SpamService {

  private final SpamCheckHistoryRepository spamCheckHistoryRepository;

  public boolean isSpamClient(Integer clientId) {

    SpamCheckHistory spamCheckHistory = new SpamCheckHistory();
    spamCheckHistory.setClientId(clientId);
    spamCheckHistory.setIsSpammer(false);
    spamCheckHistory.setCreatedAt(LocalDateTime.now());
    spamCheckHistoryRepository.save(spamCheckHistory);
    return true;
  }
}
