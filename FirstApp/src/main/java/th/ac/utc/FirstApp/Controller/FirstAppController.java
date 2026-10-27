package th.ac.utc.FirstApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAppController {

    @GetMapping("/hello")
    public String home() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/about")
        public String about() {
        return "asdasdsadsa";

    }

    @GetMapping("/")
    public String hello(@RequestParam(defaultValue = "Guest") String name) {
        return "สวัสดี " + name + "ยินดีต้อนรับ Spring boot";
        
    }



}
