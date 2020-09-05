package com.areamovil.series.controllers;

import com.areamovil.series.entity.Season;
import com.areamovil.series.entity.Series;
import com.areamovil.series.services.season.ISeasonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/season")
public class SeasonController {

    @Autowired
    private ISeasonServices seasonServices;

    @GetMapping("/list")
    public ResponseEntity<?> listSeasons() {
        List<Season> listSeason = seasonServices.findAll();
        if (listSeason != null) {
            if (listSeason.size() != 0) {
                return ResponseEntity.ok().body(listSeason);
            } else {
                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveSeason(@RequestBody Season season) {
        seasonServices.saveSeason(season);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PostMapping("/list_season_series")
    public ResponseEntity<?> getSeasonSeries(@RequestBody Series series) {
        List<Season> listSeason = seasonServices.getSeasonSeries(series.getId());
        if (listSeason != null) {
            if (listSeason.size() != 0) {
                return new ResponseEntity<>(listSeason, HttpStatus.OK);
            } else {
                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
