package ca.acentury.pocapiclienta.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @CrossOrigin(origins = "http://localhost:8089")
    @GetMapping("/service/a")
    public String[] getServices() {
        return new String[] {"Service A 1", "Service A 2", "Service A 3"};
    }
}
