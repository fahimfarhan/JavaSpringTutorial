package indiedev.soumic.start.email;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Email {
  private String title;
  private String description;

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
}
