package br.com.iagogarcia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/firstController")
public class FirstController {

  @GetMapping("/firstMethod")
  public String firstMethod() {
    return "Congratulations, you have created your first route!";
  }
}
