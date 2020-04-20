package com.webdata.dao;

import com.webdata.pojo.Anime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface AnimeDaoInterface extends JpaRepository<Anime,String> {
//    @Query(nativeQuery=true,
//            countQuery = "select count(*) from anime where title = ?1 and source in (?2)",
//            value = "select * from anime where title = ?1 and source in (?2) order by CONVERT(play_count,SIGNED) DESC")
//    Page<Anime> findAllByTitleAndSourceDesc(String title, Collection<String> source, Pageable pageable);

    Page<Anime> findAllBySourceInOrderByTrendDesc(Collection<String> source, Pageable pageable);
    Page<Anime> findAllBySourceInOrderByTrendAsc(Collection<String> source, Pageable pageable);
    Page<Anime> findAllByTitleAndSourceInOrderByTrendDesc(String title, Collection<String> source, Pageable pageable);
    Page<Anime> findAllByTitleAndSourceInOrderByTrendAsc(String title, Collection<String> source, Pageable pageable);

}
