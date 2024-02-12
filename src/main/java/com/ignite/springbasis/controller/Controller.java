package com.ignite.springbasis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

}
