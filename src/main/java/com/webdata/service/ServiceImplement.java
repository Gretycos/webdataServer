package com.webdata.service;

import com.webdata.dao.AnimeDaoInterface;
import com.webdata.pojo.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServiceImplement implements ServiceInterface{
    @Autowired
    private AnimeDaoInterface animeDaoInterface;

    @Override
    public Page<Anime> findAnimesBySourceOrderByTrendDesc(List<String> source, Pageable pageable) {
        return animeDaoInterface.findAllBySourceInOrderByTrendDesc(source,pageable);
    }

    @Override
    public Page<Anime> findAnimesBySourceOrderByTrendAsc(List<String> source, Pageable pageable) {
        return animeDaoInterface.findAllBySourceInOrderByTrendAsc(source,pageable);
    }

    @Override
    public Page<Anime> findAnimesByTitleAndSourceOrderByTrendDesc(String title, List<String> source, Pageable pageable) {
        return animeDaoInterface.findAllByTitleLikeAndSourceInOrderByTrendDesc(title,source,pageable);
    }

    @Override
    public Page<Anime> findAnimesByTitleAndSourceOrderByTrendAsc(String title, List<String> source, Pageable pageable) {
        return animeDaoInterface.findAllByTitleLikeAndSourceInOrderByTrendAsc(title,source,pageable);
    }
}
