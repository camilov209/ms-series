package com.areamovil.series.controllers;

import com.areamovil.series.entity.Episode;
import com.areamovil.series.entity.Season;
import com.areamovil.series.services.episode.IEpisodeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/episode")
public class EpisodeController {

    @Autowired
    private IEpisodeServices episodeServices;

    @GetMapping("/list")
    public ResponseEntity<?> listEpisodes() {
        List<Episode> listEpisode = episodeServices.findAll();
        if (listEpisode != null) {
            if (listEpisode.size() != 0) {
                return new ResponseEntity<>(listEpisode, HttpStatus.OK);
            } else {
                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveEpisode(@RequestBody Episode episode) {
        episodeServices.saveEpisode(episode);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PostMapping("/list_episode_series")
    public ResponseEntity<?> getEpisodeSerie(@RequestBody Season season) {
        List<Episode> listEpisode = episodeServices.getEpisodeSeason(season.getId());
        if (listEpisode != null) {
            if (listEpisode.size() != 0) {
                return new ResponseEntity<>(listEpisode, HttpStatus.OK);
            } else {
                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
