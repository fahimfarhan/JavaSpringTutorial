package indiedev.soumic.start.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmailController {

//  @Autowired // warning dey ken? Vo.O
//  private EmailService emailService;

  private EmailService emailService;

  @Autowired
  public void setEmailService(EmailService emailService) {
    this.emailService = emailService;
  }

  @RequestMapping(value = "/emails", method = RequestMethod.GET)
  public List<Email> getEmails() {
    return emailService.getEmails();
  }

  @RequestMapping(value = "/email", method = RequestMethod.GET)
  public Email getEmail(@RequestParam String title) {
    var response = emailService.getEmailByTitle(title);
    if(response == null) {
      // throw new RuntimeException("Response is null");  // eta error 500 dey
      throw new EmailNotFoundException();  // eta error 404 dey
    }
    return response;
  }



  @RequestMapping(value = "/email-v2", method = RequestMethod.GET)
  public List<Email> getEmailsV2(@RequestParam(required = false) String title) {
    if(title == null) {
      return (List<Email>) ResponseEntity.ok(emailService.getEmails()); // got class cast exception!
    }

    var list = new ArrayList<Email>();
    var email = emailService.getEmailByTitle(title);

    if(email!=null) {
      list.add(email);
    }

    if(list.isEmpty()) {
      throw new EmailNotFoundException();
    }

    return list;
  }


  @PostMapping("/save-email")
  public void saveEmail(@RequestBody Email email) {
    System.out.println("save-email: "+email.toString());
    emailService.saveEmail(email);
  }

}
