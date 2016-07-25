package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final KotlinGreetingJoiner joiner = new KotlinGreetingJoiner(new Greeter("Hi"));

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        joiner.addName(name);

        return joiner.getJoinedGreeting();
    }
}