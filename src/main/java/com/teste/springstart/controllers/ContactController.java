package com.teste.springstart.controllers;
import org.springframework.web.bind.annotation.RestController;
import com.teste.springstart.entities.ContactEntity;
import com.teste.springstart.services.ContactService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ContactController {
  @PostMapping(value="contact")
  public ContactEntity postMethodContact(@RequestBody ContactEntity contact) {
    ContactService contactService = new ContactService();

    return contactService.handleAddContact(contact);
  }
}
