package com.areamovil.series.services.episode;

import com.areamovil.series.dao.EpisodeDAO;
import com.areamovil.series.entity.Episode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodeServicesImpl implements IEpisodeServices {

    @Autowired
    private EpisodeDAO episodeDAO;

    @Override
    public List<Episode> findAll() {
        return (List<Episode>) episodeDAO.findAll();
    }

    @Override
    public void saveEpisode(Episode episode) {
        episodeDAO.save(episode);
    }

    @Override
    public List<Episode> getEpisodeSeason(Long id) {
        return episodeDAO.findBySeasonId(id);
    }
}
