package com.areamovil.series.dao;

import com.areamovil.series.entity.Series;

import org.springframework.data.repository.CrudRepository;

public interface SeriesDAO extends CrudRepository<Series, Long> {

    public Series findByName(String name);
    public Series findByAgeRecommended(Long id);
}
