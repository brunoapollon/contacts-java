package com.teste.springstart.services;

import com.teste.springstart.entities.ContactEntity;
import com.teste.springstart.mock.Database;

public class ContactService {
  public ContactEntity handleAddContact(ContactEntity contact) {
    Database db = Database.getInstance();

    return db.save(contact);
  }
}
