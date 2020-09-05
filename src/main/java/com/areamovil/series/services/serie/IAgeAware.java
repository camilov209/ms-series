package com.areamovil.series.services.serie;

import com.areamovil.series.entity.Series;

public interface IAgeAware {

    public Series getRecommendedAge(Long id);
}
