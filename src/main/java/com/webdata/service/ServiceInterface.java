package com.webdata.service;

import com.webdata.pojo.Video;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceInterface {
    Page<Video> findAnimesBySourceOrderByTrendDesc(List<String> source, Pageable pageable);
    Page<Video> findAnimesBySourceOrderByTrendAsc(List<String> source, Pageable pageable);
    Page<Video> findAnimesByTitleAndSourceOrderByTrendDesc(String title, List<String> source, Pageable pageable);
    Page<Video> findAnimesByTitleAndSourceOrderByTrendAsc(String title, List<String> source, Pageable pageable);

    Page<Video> findMoviesBySourceOrderByTrendDesc(List<String> source, Pageable pageable);
    Page<Video> findMoviesBySourceOrderByTrendAsc(List<String> source, Pageable pageable);
    Page<Video> findMoviesByTitleAndSourceOrderByTrendDesc(String title, List<String> source, Pageable pageable);
    Page<Video> findMoviesByTitleAndSourceOrderByTrendAsc(String title, List<String> source, Pageable pageable);
}
