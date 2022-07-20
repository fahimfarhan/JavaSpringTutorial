package indiedev.soumic.start;

/** 2 types of controllers */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

  @GetMapping("/greet")
  String greet() {
    return  "Hello there!";
  }
}
