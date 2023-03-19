package pro.sky.calculator.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class CalculatorController {

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String welcome(){
        return "<h1> Welcome to calculator! </h1>";

    }
}
