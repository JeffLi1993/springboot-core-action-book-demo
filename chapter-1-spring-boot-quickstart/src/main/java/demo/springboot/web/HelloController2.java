package demo.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Hello案例
 *
 * Created by bysocket on 26/09/2017.
 */
@RestController
public class HelloController2 {

    @RequestMapping("/hello2")
    String sayHello() {
        return "Hello，Spring Boot！";
    }
}
