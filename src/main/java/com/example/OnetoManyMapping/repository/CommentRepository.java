package com.example.OnetoManyMapping.repository;


import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnetoManyMapping.model.Comment;

@Repository
public interface CommentRepository  extends JpaRepository<Comment,Long>{
//	method that retrieves comments for a specific post in a pageable format

	 Optional<Comment> findByIdAndPostId(Long id, Long postId);

	Page<Comment> findByPostId(Long postId, Pageable pageable);
}
