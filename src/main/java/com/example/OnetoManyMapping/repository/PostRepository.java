package com.example.OnetoManyMapping.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnetoManyMapping.model.Post;

@Repository
public interface PostRepository  extends JpaRepository<Post,Long>{

	Page<Post> findAll(Pageable pageable);

}
