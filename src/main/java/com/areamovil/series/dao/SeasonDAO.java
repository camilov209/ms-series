package com.areamovil.series.dao;

import com.areamovil.series.entity.Season;
import com.areamovil.series.models.MSeason;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SeasonDAO extends CrudRepository<Season, Long> {

    public List<Season> findBySerieId(Long id);

}
