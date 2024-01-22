package org.mad.yclwzl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/greetings")
    public String Hello() {
        return "Hello world!";
    }
}
