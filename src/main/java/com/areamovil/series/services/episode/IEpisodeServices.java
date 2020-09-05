package com.areamovil.series.services.episode;

import com.areamovil.series.entity.Episode;

import java.util.List;

public interface IEpisodeServices {

    public List<Episode> findAll();

    public void saveEpisode(Episode episode);

    public List<Episode> getEpisodeSeason(Long id);
}
