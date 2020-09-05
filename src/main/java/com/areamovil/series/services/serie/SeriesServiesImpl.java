package com.areamovil.series.services.serie;

import com.areamovil.series.dao.SeriesDAO;
import com.areamovil.series.decorator.ArmorDecorator;
import com.areamovil.series.entity.Series;
import com.areamovil.series.services.serie.types.SerieAccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesServiesImpl implements BaseSeries {

    @Autowired
    private SeriesDAO seriesDAO;

    @Override
    public List<Series> findAll() {
        return (List<Series>) seriesDAO.findAll();
    }

    @Override
    public Series findById(Long id) {
        return seriesDAO.findById(id).orElse(null);
    }

    @Override
    public Series findByName(Series series) {
        return seriesDAO.findByName(series.getName());
    }

    @Override
    public Series updateSeries(Series series) {
        return seriesDAO.save(series);
    }

    @Override
    public void deleteSeries(Long id) {
        seriesDAO.deleteById(id);
    }

    @Override
    public void save(Series series) {
        ITypeSerie typeSerie = new SerieAccion();
        ITypeSerie typeSerieArmor = new ArmorDecorator(typeSerie);
        typeSerieArmor.seeSerie(series);
        seriesDAO.save(series);
    }

    @Override
    public Series getRecommendedAge(Long id) {
        return seriesDAO.findByAgeRecommended(id);
    }
}
