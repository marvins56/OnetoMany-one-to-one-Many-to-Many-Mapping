package com.example.OnetoManyMapping.repository;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnetoManyMapping.model.Comment;

@Repository
public interface CommentRepository  extends JpaRepository<Comment,Long>{
	 Page<Comment> findByPostId(Long postId, Pageable pageable);
	 Optional<Comment> findByIdAndPostId(Long id, Long postId);
}
