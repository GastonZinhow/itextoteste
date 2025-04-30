package com.itexto.itextoteste.repository;

import com.itexto.itextoteste.entity.Post;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer> {

    @Query("{ $or: [ {title: { $regex: ?0, $options: 'i' } },  { summary: { $regex: ?0, $options: 'i' } } ] }")
    List<Post> searchLike(String text, Sort sort);

}
