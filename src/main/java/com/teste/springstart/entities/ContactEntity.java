package com.teste.springstart.entities;

public class ContactEntity {
  public Integer id;
  public String name;
  public String phone;
  public String category;

  public ContactEntity(String name, String phone, String category) {
    this.name = name;
    this.phone = phone;
    this.category = category;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public String getCategory() {
    return category;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
