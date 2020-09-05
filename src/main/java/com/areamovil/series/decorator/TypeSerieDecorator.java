package com.areamovil.series.decorator;

import com.areamovil.series.entity.Series;
import com.areamovil.series.services.serie.ITypeSerie;
import org.springframework.beans.factory.annotation.Autowired;

public class TypeSerieDecorator implements ITypeSerie {

    @Autowired
    protected ITypeSerie typeSerie;

    public TypeSerieDecorator(ITypeSerie typeSerie){
        this.typeSerie = typeSerie;
    }

    @Override
    public void seeSerie(Series series) {
        this.typeSerie.seeSerie(series);
    }
}
