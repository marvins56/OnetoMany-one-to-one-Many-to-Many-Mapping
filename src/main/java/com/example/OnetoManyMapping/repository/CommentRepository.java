package com.example.OnetoManyMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnetoManyMapping.model.Comment;

@Repository
public interface CommentRepository  extends JpaRepository<Comment,Long>{

}
