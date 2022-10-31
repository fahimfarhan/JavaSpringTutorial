package com.soumic.client;

import lombok.Builder;
import lombok.Data;

@Data // generated getter, setter, constructor
@Builder // eta maybe Builder.withId(1).withFirstName("foo").build(); erokom kore dey, need to verify.
public class Client {
  private int id;
  private String firstName;
  private String lastName;
  private String email;
}
