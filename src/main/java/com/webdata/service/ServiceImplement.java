package com.webdata.service;

import com.webdata.dao.VideoDaoInterface;
import com.webdata.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplement implements ServiceInterface{
//    @Autowired
//    private AnimeDaoInterface animeDaoInterface;
//    @Autowired
//    private MovieDaoInterface movieDaoInterface;
    @Autowired
    private VideoDaoInterface videoDaoInterface;

    private final String ANIMATION = "animation";
    private final String MOVIE = "movie";

    @Override
    public Page<Video> findAnimesBySourceOrderByTrendDesc(List<String> source, Pageable pageable) {
        return videoDaoInterface.findAllByKindIsAndSourceInOrderByTrendDesc(ANIMATION,source,pageable);
    }

    @Override
    public Page<Video> findAnimesBySourceOrderByTrendAsc(List<String> source, Pageable pageable) {
        return videoDaoInterface.findAllByKindIsAndSourceInOrderByTrendAsc(ANIMATION,source,pageable);
    }

    @Override
    public Page<Video> findAnimesByTitleAndSourceOrderByTrendDesc(String title, List<String> source, Pageable pageable) {
        return videoDaoInterface.findAllByKindIsAndTitleLikeAndSourceInOrderByTrendDesc(ANIMATION,title,source,pageable);
    }

    @Override
    public Page<Video> findAnimesByTitleAndSourceOrderByTrendAsc(String title, List<String> source, Pageable pageable) {
        return videoDaoInterface.findAllByKindIsAndTitleLikeAndSourceInOrderByTrendAsc(ANIMATION,title,source,pageable);
    }

    @Override
    public Page<Video> findMoviesBySourceOrderByTrendDesc(List<String> source, Pageable pageable) {
        return videoDaoInterface.findAllByKindIsAndSourceInOrderByTrendDesc(MOVIE,source,pageable);
    }

    @Override
    public Page<Video> findMoviesBySourceOrderByTrendAsc(List<String> source, Pageable pageable) {
        return videoDaoInterface.findAllByKindIsAndSourceInOrderByTrendAsc(MOVIE,source,pageable);
    }

    @Override
    public Page<Video> findMoviesByTitleAndSourceOrderByTrendDesc(String title, List<String> source, Pageable pageable) {
        return videoDaoInterface.findAllByKindIsAndTitleLikeAndSourceInOrderByTrendDesc(MOVIE,title,source,pageable);
    }

    @Override
    public Page<Video> findMoviesByTitleAndSourceOrderByTrendAsc(String title, List<String> source, Pageable pageable) {
        return videoDaoInterface.findAllByKindIsAndTitleLikeAndSourceInOrderByTrendAsc(MOVIE,title,source,pageable);
    }
}
