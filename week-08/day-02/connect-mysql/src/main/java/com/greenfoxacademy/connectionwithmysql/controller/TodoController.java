package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = {"/", "/todo"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model,
                     @RequestParam(value = "search", required = false) String search) {
    if (isActive) {
      model.addAttribute("todos", todoRepository.findByDone(false));
    }
    if(search != null) {
      model.addAttribute("todos", todoRepository.findAllByTitleContaining(search));
    }
    else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String showAddTodoPage(Model model) {
    model.addAttribute("todo", new Todo());
    return "add-todo";
  }

  @PostMapping("/todo/add")
  public String todoSubmit(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(value="id") long id ) {
    todoRepository.deleteById(id);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/edit")
  public String editTodoPage(@PathVariable(value="id")long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String showEditedList(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo";
  }

}





