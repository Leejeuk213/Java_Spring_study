package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

  //  @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
   // List<Posts> findAllDesc();


}