package com.soumic.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data // generated getter, setter, constructor
@Builder // eta maybe Builder.withId(1).withFirstName("foo").build(); erokom kore dey, need to verify.
@AllArgsConstructor
@NoArgsConstructor
@Entity  // because this is a db model
public class Client {
  @Id // primary key
  // we won't be autogenerating the pks. instead, we'll create a sequence maintained ids. @SequenceGenerator, and @Generatedvalue  help us to maintain the sequences.
  @SequenceGenerator(
    name = Constants.CLIENT_ID_SEQUENCE,
    sequenceName = Constants.CLIENT_ID_SEQUENCE // "client_id_sequence"
  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = Constants.CLIENT_ID_SEQUENCE
  )
  private int id;
  private String firstName;
  private String lastName;
  private String email;
}
