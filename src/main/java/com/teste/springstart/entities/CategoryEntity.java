package com.teste.springstart.entities;

public class CategoryEntity {
  public Integer id;
  public String name;

  public CategoryEntity(String name, String phone, String category) {
    this.name = name;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
