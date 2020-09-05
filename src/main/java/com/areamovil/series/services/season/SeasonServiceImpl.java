package com.areamovil.series.services.season;

import com.areamovil.series.dao.SeasonDAO;
import com.areamovil.series.entity.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonServiceImpl implements ISeasonServices {

    @Autowired
    private SeasonDAO seasonDAO;

    @Override
    public List<Season> findAll() {
        return (List<Season>) seasonDAO.findAll();
    }

    @Override
    public void saveSeason(Season season) {
        seasonDAO.save(season);
    }

    @Override
    public List<Season> getSeasonSeries(Long id) {
        return seasonDAO.findBySerieId(id);
    }
}
