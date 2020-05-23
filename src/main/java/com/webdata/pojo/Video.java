package com.webdata.pojo;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "video_data")
@IdClass(VideoKeyClass.class)
public class Video {
    @Id
    @Column(name = "id")
    private String id;
    @Id
    @Column(name = "kind")
    private String kind;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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
        return "Video{" +
                "id='" + id + '\'' +
                ", kind='" + kind + '\'' +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", cover='" + cover + '\'' +
                ", play_count='" + play_count + '\'' +
                ", source='" + source + '\'' +
                ", trend=" + trend +
                '}';
    }
}
