package com.teste.springstart.services;

import java.util.ArrayList;

import com.teste.springstart.entities.CategoryEntity;
import com.teste.springstart.mock.Database;

public class CategoryService {
  private Database db = Database.getInstance();

  public CategoryEntity add(CategoryEntity category) {
    return this.db.saveCategory(category);
  }

  public ArrayList<CategoryEntity> getall() {
    return this.db.getCategories();
  }

  public CategoryEntity getOne(Integer id) {
    CategoryEntity categoryFounded = this.db.findCategoryById(id);
    if (categoryFounded == null)
      throw new Error("Category not found!");

    return categoryFounded;
  }

  public Boolean remove(Integer id) {
    CategoryEntity contactFounded = this.getOne(id);

    return this.db.deleteCategory(contactFounded);
  }

  public CategoryEntity update(Integer id, CategoryEntity category) {
    this.getOne(id);
    category.id = id;

    return this.db.updateCategory(category);
  }

}
