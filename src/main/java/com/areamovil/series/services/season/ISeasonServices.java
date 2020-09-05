package com.areamovil.series.services.season;

import com.areamovil.series.entity.Season;

import java.util.List;

public interface ISeasonServices {

    public List<Season> findAll();

    public void saveSeason(Season MSeason);

    public List<Season> getSeasonSeries(Long id);
}
