package com.itexto.itextoteste.controller;

import com.itexto.itextoteste.controller.util.URL;
import com.itexto.itextoteste.entity.Performance;
import com.itexto.itextoteste.entity.Post;
import com.itexto.itextoteste.service.PerformanceService;
import com.itexto.itextoteste.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="api/v2")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private PerformanceService performanceService;

    @GetMapping(value = {"/post"})
    public ResponseEntity<List<Post>> findAll(){
        List<Post> list = postService.findPost().stream().map(x -> new Post(x.getId(), x.getTitle(), x.getSummary(), x.getSite(), x.getIndexDate(), x.getPubDate())).collect(Collectors.toList());
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = {"/post/{id}/click"})
    public ResponseEntity<String> findById(@PathVariable Integer id){
        String obj = postService.findById(id).getUrl();
        performanceService.updateCount(id);
        return ResponseEntity.ok().body(obj);
    }
}
