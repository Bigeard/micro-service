package re.aventu.microservice.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
@RequestMapping("/api/v1")
public class HomeController {  
    @RequestMapping("/hello")  
    public String hello(){  
        return"Hello World";  
    }
}  