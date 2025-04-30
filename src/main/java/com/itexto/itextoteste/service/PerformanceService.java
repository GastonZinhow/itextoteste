package com.itexto.itextoteste.service;

import com.itexto.itextoteste.entity.Performance;
import com.itexto.itextoteste.repository.PerfomanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceService {

    @Autowired
    private PerfomanceRepository perRepo;

    public List<Performance> findAll(){
        return perRepo.findAll();
    }

    public Performance findById(Integer id) {
        Optional<Performance> obj = perRepo.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Objeto não encontrado"));
    }

    public void updateCount(Integer id) {
        Performance performance = perRepo.findById(id).orElse(null);
        if (performance != null) {
            performance.setClicks(performance.getClicks() + 1);
            perRepo.save(performance);
        }else {
            Performance newPer = new Performance();
            newPer.setPostId(id);
            newPer.setClicks(1);
            perRepo.save(newPer);
        }
    }
}
