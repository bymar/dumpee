package br.com.cesarschool.dumpeeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/")
  public String homePage() {
    return "Welcome to Dump.ee";
  }

  @GetMapping("/restricted")
  public String loggedPage() {
    return "You in Dump.ee";
  }
}
