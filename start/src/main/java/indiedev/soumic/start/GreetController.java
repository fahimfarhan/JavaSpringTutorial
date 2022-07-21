package indiedev.soumic.start;

/** 2 types of controllers */
import indiedev.soumic.start.email.Email;
import org.springframework.stereotype.Controller; // don't use this
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;  // use this one

@RestController
public class GreetController {

  @GetMapping("/greet")
  Email greet() {
    var email = new Email();
    email.setTitle("Ricardo Milos");
    email.setDescription("It is not rainbow if it's Ricardo");
    email.setSomeThingSecret("This should not be seen on the output on browser");
    return  email;
  }

  // there are other ways
  @RequestMapping(value = "/greet/v2", method = RequestMethod.GET)
  String greetV2() {
    return "Hello there! v2";
  }

}
