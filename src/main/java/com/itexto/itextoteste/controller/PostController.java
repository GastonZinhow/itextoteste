package com.itexto.itextoteste.controller;

import com.itexto.itextoteste.controller.util.URL;
import com.itexto.itextoteste.entity.Post;
import com.itexto.itextoteste.service.PerformanceService;
import com.itexto.itextoteste.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v2/post")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private PerformanceService performanceService;

    @GetMapping(value = {"/titlesearch"})
    public ResponseEntity<List<Post>> findByTitleSummary(@RequestParam(value="text", defaultValue="") String text){
        text = URL.decodeParam(text);
        List<Post> list = postService.findByTitleSummary(text);

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = {"/{id}/click"})
    public ResponseEntity<String> findById(@PathVariable Integer id){
        String obj = postService.findById(id).getUrl();
        performanceService.updateCount(id);
        return ResponseEntity.ok().body(obj);
    }
}
