package com.areamovil.series.services.serie.types;

import com.areamovil.series.entity.Series;
import com.areamovil.series.services.serie.ITypeSerie;

public class SerieRomantic implements ITypeSerie {
    @Override
    public void seeSerie(Series series) {
        System.out.println("La serie " + series.getName());
        System.out.println("Es Romantica");
    }
}
