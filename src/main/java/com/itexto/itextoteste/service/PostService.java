package com.itexto.itextoteste.service;

import com.itexto.itextoteste.entity.Post;
import com.itexto.itextoteste.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(Integer id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Post não encontrado"));
    }

    public List<Post> findPost() {
        return postRepository.findAll(Sort.by(Sort.Direction.DESC, "pubDate"));
    }
}
