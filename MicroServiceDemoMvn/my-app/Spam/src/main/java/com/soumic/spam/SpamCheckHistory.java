package com.soumic.spam;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data // generated getter, setter, constructor
@Builder // eta maybe Builder.withId(1).withFirstName("foo").build(); erokom kore dey, need to verify.
@AllArgsConstructor
@NoArgsConstructor
@Entity  // because this is a db model
public class SpamCheckHistory {
  @Id

  @SequenceGenerator(
      name = Constants.SPAM_ID_SEQUENCE,
      sequenceName = Constants.SPAM_ID_SEQUENCE // "client_id_sequence"
  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = Constants.SPAM_ID_SEQUENCE
  )
  private Integer id;
  private Integer clientId;
  private Boolean isSpammer;
  private LocalDateTime createdAt;
}
