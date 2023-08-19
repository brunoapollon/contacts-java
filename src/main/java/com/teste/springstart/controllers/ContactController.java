package com.teste.springstart.controllers;

import org.springframework.web.bind.annotation.RestController;
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
  public ContactEntity postMethodContact(@RequestBody ContactEntity contact) {
    return this.contactService.handleAddContact(contact);
  }

  @GetMapping(value = "contact")
  public ArrayList<ContactEntity> getMethodListContacts() {
    return this.contactService.handleGetAllContacts();
  }
}
