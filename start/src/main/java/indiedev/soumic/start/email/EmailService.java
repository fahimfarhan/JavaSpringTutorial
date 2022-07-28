package indiedev.soumic.start.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EmailService {

  private EmailRepository emailRepository;

  @Autowired
  public void setEmailRepository(EmailRepository emailRepository) {
    this.emailRepository = emailRepository;
  }


  public List<Email> getEmails() {
    return emailRepository.findAll();
  }


  public Email getEmailByTitle(String title) {
    return null;
  }

  public boolean saveEmail(Email email) {
    if(isValid(email)) {
      emailRepository.save(email);
      return true;
    }
    return false;
  }

  public boolean isValid(Email email) {
    if(email.getTitle() == null || email.getDescription() == null) {
      return false;
    }
    return true;
  }
}
