package com.greenfoxacademy.thereddit.controller;

import com.greenfoxacademy.thereddit.model.Post;
import com.greenfoxacademy.thereddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  @Autowired
  PostRepository postRepository;

  @GetMapping("/")
  public String renderIndexPage() {
    return "index";
  }

  @GetMapping("/submit")
  public String renderSubmitPage(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute Post post) {
    postRepository.save(post);
    return "redirect:/";
  }
}
