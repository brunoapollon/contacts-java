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
    return this.contactService.handleAddContact(contact);
  }

  @GetMapping(value = "contact")
  @ResponseBody
  public ArrayList<ContactEntity> index() {
    return this.contactService.handleGetAllContacts();
  }
  @GetMapping(value = "contact/{id}")
  @ResponseBody
  public ContactEntity show(@PathVariable(name = "id") Integer id) {
    return this.contactService.findOne((id));
  }

  @DeleteMapping(value = "contact/{id}")
  @ResponseBody
  public Boolean delete(@PathVariable(name = "id") Integer id) {
    return this.contactService.removeContact(id);
  }

  @PutMapping(value = "contact/{id}")
  @ResponseBody
  public ContactEntity update(@PathVariable(name = "id") Integer id, @RequestBody ContactEntity contact) {
    return this.contactService.updateContact(id, contact);
  }
}
