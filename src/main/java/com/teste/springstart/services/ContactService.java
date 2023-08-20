package com.teste.springstart.services;

import java.util.ArrayList;

import com.teste.springstart.entities.ContactEntity;
import com.teste.springstart.mock.Database;

public class ContactService {
  private Database db = Database.getInstance();

  public ContactEntity add(ContactEntity contact) {
    return this.db.save(contact);
  }

  public ArrayList<ContactEntity> getall() {
    return this.db.getAllContacts();
  }

  public ContactEntity getOne(Integer id) {
    ContactEntity contactFounded = this.db.findById(id);
    if (contactFounded == null)
      throw new Error("Contact not found!");

    return contactFounded;
  }

  public Boolean remove(Integer id) {
    ContactEntity contactFounded = this.db.findById(id);
    if (contactFounded == null)
      throw new Error("Contact not found!");

    return this.db.delete(contactFounded);
  }

  public ContactEntity update(Integer id, ContactEntity contact) {
    ContactEntity contactFounded = this.db.findById(id);
    if (contactFounded == null)
      throw new Error("Contact not found!");

    contact.id = id;

    return this.db.update(contact);
  }

}
