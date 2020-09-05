package com.areamovil.series.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MSeason {

    private Long id;
    private String name;
    private String description;
    private Long serieId;
    private List<MEpisode> episodes = new ArrayList<>();
    private Date createAt;

    public MSeason() {
    }

    public MSeason(Long id, String name, String description, Long serieId, List<MEpisode> episodes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.serieId = serieId;
        this.episodes = episodes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getSerieId() {
        return serieId;
    }

    public void setSerieId(Long serieId) {
        this.serieId = serieId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<MEpisode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<MEpisode> episodes) {
        this.episodes = episodes;
    }
}
