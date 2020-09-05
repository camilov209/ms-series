package com.areamovil.series.dao;

import com.areamovil.series.entity.Episode;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EpisodeDAO extends CrudRepository<Episode, Long> {

    public List<Episode> findBySeasonId(Long id);

}
