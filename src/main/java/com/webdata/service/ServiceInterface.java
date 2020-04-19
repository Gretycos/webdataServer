package com.webdata.service;

import com.webdata.pojo.Anime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ServiceInterface {
    Page<Anime> findAnimesBySourceOrderByTrendDesc(List<String> source, Pageable pageable);
    Page<Anime> findAnimesBySourceOrderByTrendAsc(List<String> source, Pageable pageable);
    Page<Anime> findAnimesByTitleAndSourceOrderByTrendDesc(String title, List<String> source, Pageable pageable);
    Page<Anime> findAnimesByTitleAndSourceOrderByTrendAsc(String title, List<String> source, Pageable pageable);
}
