package com.webdata.dao;

import com.webdata.pojo.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface MovieDaoInterface extends JpaRepository<Movie,String> {
    Page<Movie> findAllBySourceInOrderByTrendDesc(Collection<String> source, Pageable pageable);
    Page<Movie> findAllBySourceInOrderByTrendAsc(Collection<String> source, Pageable pageable);
    Page<Movie> findAllByTitleLikeAndSourceInOrderByTrendDesc(String title, Collection<String> source, Pageable pageable);
    Page<Movie> findAllByTitleLikeAndSourceInOrderByTrendAsc(String title, Collection<String> source, Pageable pageable);
}
