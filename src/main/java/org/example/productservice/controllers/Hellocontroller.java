package org.example.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hellocontroller {

    @GetMapping("/sayHello/{name}/{times}/")
    public String sayHello(@PathVariable String name, @PathVariable int times) {
        String ans = "";
        for (int i=0; i<times; i++) {
            ans += "HelloWorld" + " " + name + " " + i + "\n";
        }
        return ans;
    }
}
