package indiedev.soumic.start.email;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {
  /**
   Jpa knows `findBy` keyword. so we have to give the last word.In our model, we have
   title. so it will become Title
   titlle => Titlle

   Format:
   first character upperCase + the rest of the string is exactly the same. That's it!
  */
  Email findByTitle(String title);
  Email findByTitleIgnoreCase(String title);
}
