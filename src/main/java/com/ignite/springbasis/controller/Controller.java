package com.ignite.springbasis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

  @PostMapping("/posting")
  public String post(@RequestBody User user) {
      //TODO: process POST request
      return "post success " + user.username();
  }

  record User(String username)
  {

  }

}
