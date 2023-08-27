package com.teste.springstart.entities;

public class ContactEntity {
  public Integer id;
  public String name;
  public String phone;
  public Integer categoryId;

  public ContactEntity(String name, String phone, Integer categoryId) {
    this.name = name;
    this.phone = phone;
    this.categoryId = categoryId;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
