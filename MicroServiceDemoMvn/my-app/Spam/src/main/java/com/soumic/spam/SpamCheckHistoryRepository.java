package com.soumic.spam;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpamCheckHistoryRepository extends JpaRepository<SpamCheckHistory, Integer> {
}
