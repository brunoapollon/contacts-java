package com.teste.springstart.services;

import java.util.ArrayList;

import com.teste.springstart.entities.ContactEntity;
import com.teste.springstart.mock.Database;

public class ContactService {
  private Database db = Database.getInstance();

  public ContactEntity add(ContactEntity contact) {
    return this.db.saveContact(contact);
  }

  public ArrayList<ContactEntity> getall() {
    return this.db.getContacts();
  }

  public ContactEntity getOne(Integer id) {
    ContactEntity contactFounded = this.db.findContactById(id);
    if (contactFounded == null)
      throw new Error("Contact not found!");

    return contactFounded;
  }

  public Boolean remove(Integer id) {
    ContactEntity contactFounded = this.getOne(id);

    return this.db.deleteContact(contactFounded);
  }

  public ContactEntity update(Integer id, ContactEntity contact) {
    this.getOne(id);
    contact.id = id;

    return this.db.updateContact(contact);
  }

}
