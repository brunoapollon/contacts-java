package com.teste.springstart.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teste.springstart.entities.CategoryEntity;
import com.teste.springstart.services.CategoryService;

@RestController
public class CategoryController {
   private CategoryService categoryService = new CategoryService();

  @PostMapping(value = "category")
  @ResponseBody
  public CategoryEntity create(@RequestBody CategoryEntity category) {
    return this.categoryService.add(category);
  }

  @GetMapping(value = "category")
  @ResponseBody
  public ArrayList<CategoryEntity> index() {
    return this.categoryService.getall();
  }

  @GetMapping(value = "category/{id}")
  @ResponseBody
  public CategoryEntity show(@PathVariable(name = "id") Integer id) {
    return this.categoryService.getOne((id));
  }

  @DeleteMapping(value = "category/{id}")
  @ResponseBody
  public Boolean delete(@PathVariable(name = "id") Integer id) {
    return this.categoryService.remove(id);
  }

  @PutMapping(value = "category/{id}")
  @ResponseBody
  public CategoryEntity update(@PathVariable(name = "id") Integer id, @RequestBody CategoryEntity category) {
    return this.categoryService.update(id, category);
  }
}
