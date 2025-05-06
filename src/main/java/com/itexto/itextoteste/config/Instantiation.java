
package com.itexto.itextoteste.config;

// Essa configuracao foi criada para testar a criacao das colecoes no mongoDB, a imagem Docker e os dados estao
// funcionando data em -> data/perfomance.json & data/posts.json

import com.itexto.itextoteste.entity.Performance;
import com.itexto.itextoteste.entity.Post;
import com.itexto.itextoteste.entity.Site;
import com.itexto.itextoteste.repository.PerfomanceRepository;
import com.itexto.itextoteste.repository.PostRepository;

import java.util.Arrays;

import com.itexto.itextoteste.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/*
@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private PerfomanceRepository perfomanceRepository;
    @Autowired
    private SiteRepository siteRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        postRepository.deleteAll();
        perfomanceRepository.deleteAll();
        siteRepository.deleteAll();

        Site globo = new Site(1, "G1 - Globo", "https://g1.globo.com/rss/g1/", "https://g1.globo.com");


        Post post1 = new Post(1, "Aprovado no estagio!", "Consegui uma vaga muito boa!", "https://itexto.com.br", globo, sdf.parse("29/04/2025"), sdf.parse("29/04/2025"));
        Post post2 = new Post(2, "Aprovado como junior!", "Consegui uma vaga muito boa!", "https://itexto.com.br", globo, sdf.parse("29/10/2025"), sdf.parse("20/01/2023"));
        Post post3 = new Post(3, "Aprovado como pleno!", "Consegui uma vaga muito boa!", "https://itexto.com.br", globo, sdf.parse("29/04/2027"), sdf.parse("29/05/2025"));
        Post post4 = new Post(4, "Fundei uma empresa e procuro funcionarios!", "Consegui aprovar minha empresa ela chama itexto!", "https://itexto.com.br", globo, sdf.parse("29/04/2013"), sdf.parse("30/11/2024"));

        Performance perf1 = new Performance(1, 10);
        Performance perf2 = new Performance(4, 100);
        siteRepository.save(globo);
        postRepository.saveAll(Arrays.asList(post1, post2, post3, post4));
        perfomanceRepository.saveAll(Arrays.asList(perf1, perf2));


    }


}
        */