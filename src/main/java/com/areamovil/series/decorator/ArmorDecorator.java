package com.areamovil.series.decorator;

import com.areamovil.series.entity.Series;
import com.areamovil.series.services.serie.ITypeSerie;

public class ArmorDecorator extends TypeSerieDecorator {
    public ArmorDecorator(ITypeSerie typeSerie) {
        super(typeSerie);
    }

    @Override
    public void seeSerie(Series series) {
        super.seeSerie(series);
    }

    public void addArmorSeries(Series series){
        System.out.println("Se agrego blindaje a la serie" + series.getName());
    }
}
