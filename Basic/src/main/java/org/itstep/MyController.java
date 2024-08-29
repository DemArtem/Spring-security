package org.itstep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/root")
    public String root(){
        return "root";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

}
