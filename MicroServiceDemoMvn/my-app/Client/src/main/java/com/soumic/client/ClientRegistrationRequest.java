package com.soumic.client;

public record ClientRegistrationRequest(
    String firstName,
    String lastName,
    String email
) {

}
