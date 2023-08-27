package com.teste.springstart.mock;

import java.util.ArrayList;

import com.teste.springstart.entities.CategoryEntity;
import com.teste.springstart.entities.ContactEntity;

public class Database {
  public ArrayList<ContactEntity> contacts;
  public ArrayList<CategoryEntity> categories;
  private static Database database;

  private Database() {
    this.contacts = new ArrayList<ContactEntity>();
    this.categories = new ArrayList<CategoryEntity>();
  }

  public static Database getInstance() {
    if (database == null)
      database = new Database();

    return database;
  }

  public ArrayList<ContactEntity> getContacts() {
    return contacts;
  }

  public ArrayList<CategoryEntity> getCategories() {
    return categories;
  }

  public ContactEntity saveContact(ContactEntity newContact) {
    newContact.setId(this.contacts.size());

    this.contacts.add(newContact);

    return newContact;
  }

  public ContactEntity findContactById(Integer id) {
    ContactEntity contactFounded = null;
    for (ContactEntity contact : this.contacts) {
      if (contact.id == id) {
        contactFounded = contact;
      }
    }

    return contactFounded;
  }

  public Boolean deleteContact(ContactEntity contact) {
    return this.contacts.remove(contact);
  }

  public CategoryEntity saveCategory(CategoryEntity newCategory) {
    newCategory.setId(this.contacts.size());

    this.categories.add(newCategory);

    return newCategory;
  }

  public CategoryEntity findCategoryById(Integer id) {
    CategoryEntity categoryFounded = null;
    for (CategoryEntity contact : this.categories) {
      if (contact.id == id) {
        categoryFounded = contact;
      }
    }

    return categoryFounded;
  }

  public ContactEntity updateContact(ContactEntity contact) {
    this.contacts.set(contact.id, contact);
    return contact;
  }

  public Boolean deleteCategory(CategoryEntity category) {
    return this.categories.remove(category);
  }

  public CategoryEntity updateCategory(CategoryEntity category) {
    this.categories.set(category.id, category);
    return category;
  }
}
