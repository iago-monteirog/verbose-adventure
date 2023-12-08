package br.com.iagogarcia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/firstController")
public class FirstController {

  @GetMapping("/firstMethod/{id}")
  public String firstMethod(@PathVariable String id) {
    return "The param is " + id;
  }

  @GetMapping("/methodWithQueryParams")
  public String methodWithQueryParams(@RequestParam String id) {
    return "The param with methodWithQueryParams is " + id;
  }

  @GetMapping("/methodWithQueryParams2")
  public String methodWithQueryParams2(@RequestParam Map<String, String> allParams) {
    return "The param with methodWithQueryParams is " + allParams.entrySet();
  }

  @PostMapping("/methodWithBodyParams")
  public String methodWithBodyParams(@RequestBody User user) {
    return "The username is " + user.username();

  }

  @PostMapping("/methodWithHeaders")
  public String methodWithHeaders(@RequestHeader("name") String name) {
    return "The name is " + name;
  }

  @PostMapping("/methodWithListHeaders")
  public String methodWithListHeaders(@RequestHeader Map<String, String> headers) {
    return "The header is " + headers.entrySet();
  }

  @GetMapping("/methodResponseEntity/{id}")
  public ResponseEntity<Object> methodResponseEntity(@PathVariable Long id) {
    var user = new User("Iago");

    if (id > 5) {
      return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    return ResponseEntity.badRequest().body("Numero menor que 5");

  }

  record User(String username) {
  }
}
