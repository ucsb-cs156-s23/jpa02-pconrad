package edu.ucsb.cs156.spring.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        log.info("HelloController.index() called");
        return "Greetings from Spring Boot!";
    }
    
}
