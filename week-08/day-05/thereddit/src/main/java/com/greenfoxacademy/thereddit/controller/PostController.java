package com.greenfoxacademy.thereddit.controller;

import com.greenfoxacademy.thereddit.model.Post;
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

  @GetMapping(value = "/{id}/voteup")
  public String voteUp(@PathVariable(name = "id") Long id) {
    postService.incrementCounterById(id);
    postService.savePost(postService.findPostById(id));
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/votedown")
  public String voteDown(@PathVariable(name = "id") Long id) {
    postService.decrementCounterById(id);
    postService.savePost(postService.findPostById(id));
    return "redirect:/";
  }
}
