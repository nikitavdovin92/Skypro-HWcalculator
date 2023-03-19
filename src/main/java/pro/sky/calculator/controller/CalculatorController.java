package pro.sky.calculator.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class CalculatorController {

    @GetMapping(path = "/calculator")
    public String welcome(){
        return "Welcome to calculator";

    }


    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
    return a+ " + " +b+ " = " +(a+b);
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam("num1") byte a, @RequestParam("num2") byte b) {
        return a+ " - " +b+ " = " +(a-b);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") short a, @RequestParam("num2") short b) {
        return a+ " * " +b+ " = " +(a * b);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") long a, @RequestParam("num2") long b) {
        return a+ " / " +b+ " = " +(a / b);
    }
}
