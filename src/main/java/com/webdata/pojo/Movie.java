package com.webdata.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    private String id;
    @Column(name = "title")
    private String title;
    @Column(name = "link")
    private String link;
    @Column(name = "cover")
    private String cover;
    @Column(name = "play_count")
    private String play_count;
    @Column(name = "source")
    private String source;
    @Column(name = "trend")
    private BigDecimal trend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPlay_count() {
        return play_count;
    }

    public void setPlay_count(String play_count) {
        this.play_count = play_count;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public BigDecimal getTrend() {
        return trend;
    }

    public void setTrend(BigDecimal trend) {
        this.trend = trend;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", cover='" + cover + '\'' +
                ", play_count='" + play_count + '\'' +
                ", source='" + source + '\'' +
                ", trend=" + trend +
                '}';
    }
}
