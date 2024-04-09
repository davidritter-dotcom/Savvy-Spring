package ch.ffhs.savvy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/gtfo")
    public String index2() {
        return "bye, auf Nimmerwiedersehen!!!";
    }
}