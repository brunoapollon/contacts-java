package com.teste.springstart.services;

import java.util.ArrayList;

import com.teste.springstart.entities.ContactEntity;
import com.teste.springstart.mock.Database;

public class ContactService {
  private Database db = Database.getInstance();

  public ContactEntity handleAddContact(ContactEntity contact) {
    return this.db.save(contact);
  }

  public ArrayList<ContactEntity> handleGetAllContacts() {
    return this.db.getAllContacts();
  }

  public ContactEntity findOne(Integer id) {
    ContactEntity contactFounded =  this.db.findById(id);
    if (contactFounded  == null)
      throw new Error("Contact not found!");

    return contactFounded;
  }

  public Boolean removeContact(Integer id) {
    ContactEntity contactFounded =  this.db.findById(id);
    if (contactFounded  == null)
      throw new Error("Contact not found!");

    return this.db.delete(contactFounded);
  }
}
