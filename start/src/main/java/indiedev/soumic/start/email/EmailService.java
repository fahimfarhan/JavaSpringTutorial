package indiedev.soumic.start.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EmailService {

  @Autowired
  EmailRepository emailRepository;

  /*
  @Autowired
  public void setEmailRepository(EmailRepository emailRepository) {
    this.emailRepository = emailRepository;
  }
  */


  public List<Email> getEmails() {
    return emailRepository.findAll();
  }


  public Email getEmailByTitle(String title) {
    return null;
  }

  public void saveEmail(Email email) {
    emailRepository.save(email);
  }

}
