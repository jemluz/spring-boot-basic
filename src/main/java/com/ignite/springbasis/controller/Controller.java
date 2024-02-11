package com.ignite.springbasis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/recurso-inicial")
public class Controller {

  @GetMapping("/teste") // recurso final
  public String getMethodName() {
    return new String("getzinho bala");
  }

}
