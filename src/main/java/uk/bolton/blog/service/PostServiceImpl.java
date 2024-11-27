package uk.bolton.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.bolton.blog.entity.Post;
import uk.bolton.blog.repository.PostRepository;

import java.util.Date;

@Service
public class PostServiceImpl implements PostService{

    @Autowired(required=true)
    private PostRepository postRepository;

    public Post savePost(Post post) {
        post.setLikeCount(0);
        post.setViewCount(0);
        post.setDate(new Date());

        return postRepository.save(post);
    }
}
