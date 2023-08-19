package com.teste.springstart.mock;

import java.util.ArrayList;

import com.teste.springstart.entities.ContactEntity;

public class Database {
  public ArrayList<ContactEntity> contacts;
  private static Database database;

  private Database(){
    this.contacts = new ArrayList<ContactEntity>();
  }

  public static Database getInstance(){
    if(database == null)
    database = new Database();

    return database;
  }

  public ArrayList<ContactEntity> getContacts() {
    return contacts;
  }

  public ContactEntity save(ContactEntity newContact) {
    newContact.setId(this.contacts.size());

    this.contacts.add(newContact);

    return newContact;
  }

  public ArrayList<ContactEntity> getAllContacts() {
    return this.contacts;
  }
}
