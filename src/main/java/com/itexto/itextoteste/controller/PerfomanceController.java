package com.itexto.itextoteste.controller;

import com.itexto.itextoteste.entity.Performance;
import com.itexto.itextoteste.service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/performance")
public class PerfomanceController {
    @Autowired
    private PerformanceService perService;

    @GetMapping
    public ResponseEntity<List<Performance>> findAll(){
        List<Performance> list = perService.findAll().stream().map(x -> new Performance(x.getPostId(), x.getClicks())).collect(Collectors.toList());
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Performance> findById(@PathVariable Integer id){
        Performance obj = perService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
