package br.com.cesarschool.dumpeeapi.controller;

import br.com.cesarschool.dumpeeapi.service.NewDiscardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/discard")
@RestController
public class NewDiscardController {

  @Autowired
  NewDiscardService service;

  @GetMapping("/discard-infos")
  public void getDiscardItemInfo() {

  }

  @PostMapping("/new-discard")
  public void doNewDiscard() {

  }
}
