package com.greenfoxacademy.thereddit.repository;

import com.greenfoxacademy.thereddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAll();
  List<Post> findAllByOrderByCounterDesc();
}

