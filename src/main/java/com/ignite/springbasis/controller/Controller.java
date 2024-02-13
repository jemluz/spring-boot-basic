package com.ignite.springbasis.controller;

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
@RequestMapping("/recurso-inicial")
public class Controller {

  @GetMapping("/teste-path/{id}") // recurso final
  public String getPath(@PathVariable String id) {
    return "getzinho path " + id;
  }

  @GetMapping("/teste-query") // recurso final
  public String getQuery(@RequestParam String id) {
    return "getzinho query " + id;
  }

  @GetMapping("/teste-querys") // recurso final
  public String getQuerys(@RequestParam Map<String, String> allParams) {
    return "getzinho query " + allParams.entrySet();
  }

  @PostMapping("/posting-body")
  public String postWithBody(@RequestBody User user) {
      return "post success " + user.username();
  }

  @PostMapping("/posting-header")
  public String postWithHeader(@RequestHeader("name") String name) {
      return "post success " + name;
  }

  @PostMapping("/posting-header-list")
  public String postWithHeaders(@RequestHeader Map<String, String> headers) {
      return "post success " + headers.entrySet();
  }

  @GetMapping("/response-entity")
  public ResponseEntity<Object> getResponseEntity(@RequestHeader Map<String, String> headers) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("deu um erro");
  }

  @GetMapping("/response-entity")
  public ResponseEntity<Object> getResponseEntity(@PathVariable Long id) {
    var user = new User("jemluz");

    if (id > 5) {
      return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("deu um erro");
  }


  record User(String username)
  {

  }

}
