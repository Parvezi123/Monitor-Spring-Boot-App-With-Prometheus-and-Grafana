package parvez.alam.monitor_spring_boot_app.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @Timed(value = "helloSuccess.time", description = "Time taken to fetch Success")
    @GetMapping("/hello")
    ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Success");
    }
}
