package br.com.portalz.controle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class entradacarro {
    @GetMapping(value="/")
    public String getMethodName(@RequestParam String param) {
        return "new SomeData()";
    }
    

}
