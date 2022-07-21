package indiedev.soumic.start.email;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class EmailService {
  private ArrayList<Email> emails = new ArrayList<>();

  public EmailService() {
    initEmails();
  }

  private void initEmails() {
    var emailOne = new Email("one", "Ricardo 1", "Secret");
    var emailTwo = new Email("two", "Ricardo 2", "secret 2");

    emails.add(emailOne);
    emails.add(emailTwo);
  }

  public ArrayList<Email> getEmails() {
    return emails;
  }


  public Email getEmailByTitle(String title) {
    if(title == null) {
      return null;
    }
    for(Email email : emails) {
      if(title.equalsIgnoreCase(email.getTitle())) {
        return email;
      }
    }
    return null;
  }

  public void saveEmail(Email email) {
    emails.add(email);
  }

}
