package com.areamovil.series.models;

import java.util.Date;

public class MEpisode {

    private Long id;
    private String name;
    private String description;
    private String video;
    private String duration;
    private int numEpisode;
    private Long seasonId;
    private Date createAt;

    public MEpisode() {
    }

    public MEpisode(Long id, String name, String description, String video, String duration, int numEpisode, Long seasonId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.video = video;
        this.duration = duration;
        this.numEpisode = numEpisode;
        this.seasonId = seasonId;
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

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getNumEpisode() {
        return numEpisode;
    }

    public void setNumEpisode(int numEpisode) {
        this.numEpisode = numEpisode;
    }

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
