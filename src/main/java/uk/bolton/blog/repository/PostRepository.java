package uk.bolton.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.bolton.blog.entity.Post;

public interface PostRepository  extends JpaRepository<Post, Long> {
}
