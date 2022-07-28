package indiedev.soumic.start.email;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Email {
  @JsonProperty("title")
  private String title;
  @JsonProperty("description")
  private String description;

  @JsonProperty("some_thing_secret")
  private String someThingSecret;


  public Email() {
    title = "";
    description = "";
    someThingSecret = "";
  }

  public Email(String title, String description, String someThingSecret) {
    this.title = title;
    this.description = description;
    this.someThingSecret = someThingSecret;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @JsonIgnore  // this will prevent sending this field to the client
  public String getSomeThingSecret() {
    return someThingSecret;
  }

  public void setSomeThingSecret(String someThingSecret) {
    this.someThingSecret = someThingSecret;
  }

  @Override
  public String toString() {
    return "Email{" +
        "title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", someThingSecret='" + someThingSecret + '\'' +
        '}';
  }
}
