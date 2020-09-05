package com.areamovil.series.services.serie;

import com.areamovil.series.entity.Series;

import java.util.List;

public interface ISeriesServices {

    /*
        * PRINCIPLE SOLID
        * DIP ( DEPENDENCY INVERSION PRINCIPLE )
    */

    public List<Series> findAll();

    public Series findById(Long id);

    public Series findByName(Series MSeries);

    public Series updateSeries(Series MSeries);

    public void deleteSeries(Long id);

    public void save(Series MSeries);
}
