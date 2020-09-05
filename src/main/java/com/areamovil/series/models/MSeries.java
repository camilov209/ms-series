package com.areamovil.series.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MSeries {

    private static final long serialVersionUID = 5644840156810643263L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 60, unique = true)
    private String name;
    @Column(length = 10000)
    private String description;
    @Column(length = 60)
    private String gender;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_at")
    private Date createAt;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "serie_id", referencedColumnName = "id")
    private List<MSeason> season = new ArrayList<>();

    @PrePersist
    public void prePresist() {
        createAt = new Date();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<MSeason> getSeason() {
        return season;
    }

    public void setSeason(List<MSeason> season) {
        this.season = season;
    }

}
