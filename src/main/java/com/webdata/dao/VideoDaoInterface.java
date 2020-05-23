package com.webdata.dao;

import com.webdata.pojo.Video;
import com.webdata.pojo.VideoKeyClass;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface VideoDaoInterface extends JpaRepository<Video,VideoKeyClass> {
    Page<Video> findAllByKindIsAndSourceInOrderByTrendDesc(String kind,Collection<String> source, Pageable pageable);
    Page<Video> findAllByKindIsAndSourceInOrderByTrendAsc(String kind, Collection<String> source, Pageable pageable);
    Page<Video> findAllByKindIsAndTitleLikeAndSourceInOrderByTrendDesc(String kind, String title, Collection<String> source, Pageable pageable);
    Page<Video> findAllByKindIsAndTitleLikeAndSourceInOrderByTrendAsc(String kind, String title, Collection<String> source, Pageable pageable);

}
