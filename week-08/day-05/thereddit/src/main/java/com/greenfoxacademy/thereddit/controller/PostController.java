package com.greenfoxacademy.thereddit.controller;

import com.greenfoxacademy.thereddit.model.Post;
import com.greenfoxacademy.thereddit.repository.PostRepository;
import com.greenfoxacademy.thereddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  @Autowired
  PostService postService;

  @GetMapping("/")
  public String renderIndexPage(Model model) {
    model.addAttribute("posts", postService.findAll());
    return "index";
  }

//  @GetMapping("/{id}/delete")
//  public String deleteTodo(@PathVariable(value="id") long id ) {
//
//    return "redirect:/todo";
//  }
//
//  @PostMapping("/")
//  public String voteForPost

  @GetMapping("/submit")
  public String renderSubmitPage(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute Post post) {
    postService.savePost(post);
    return "redirect:/";
  }
}
