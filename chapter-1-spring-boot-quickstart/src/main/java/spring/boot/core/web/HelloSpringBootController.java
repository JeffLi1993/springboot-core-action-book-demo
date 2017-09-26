package spring.boot.core.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 26/09/2017.
 */
@Controller
public class HelloSpringBootController {

    @RequestMapping("/hello")
    @ResponseBody
    String sayHello() {
        return "Hello，Spring Boot Core Action Book";
    }
}
