package com.greenfoxacademy.thereddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String post;

  public Post() {
  }

  public Post(String post) {
    this.post = post;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }
}
