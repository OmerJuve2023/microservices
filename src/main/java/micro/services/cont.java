package micro.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cont {
    @GetMapping(value = "/")
    public String saludate() {
        return "indexe";
    }
}
