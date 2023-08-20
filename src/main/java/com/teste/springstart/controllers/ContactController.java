package com.teste.springstart.controllers;

import org.springframework.web.bind.annotation.*;
import com.teste.springstart.entities.ContactEntity;
import com.teste.springstart.services.ContactService;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ContactController {
  private ContactService contactService = new ContactService();

  @PostMapping(value = "contact")
  @ResponseBody
  public ContactEntity create(@RequestBody ContactEntity contact) {
    return this.contactService.add(contact);
  }

  @GetMapping(value = "contact")
  @ResponseBody
  public ArrayList<ContactEntity> index() {
    return this.contactService.getall();
  }

  @GetMapping(value = "contact/{id}")
  @ResponseBody
  public ContactEntity show(@PathVariable(name = "id") Integer id) {
    return this.contactService.getOne((id));
  }

  @DeleteMapping(value = "contact/{id}")
  @ResponseBody
  public Boolean delete(@PathVariable(name = "id") Integer id) {
    return this.contactService.remove(id);
  }

  @PutMapping(value = "contact/{id}")
  @ResponseBody
  public ContactEntity update(@PathVariable(name = "id") Integer id, @RequestBody ContactEntity contact) {
    return this.contactService.update(id, contact);
  }
}
