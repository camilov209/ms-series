package com.areamovil.series.controllers;

import com.areamovil.series.entity.Series;
import com.areamovil.series.services.serie.IAgeAware;
import com.areamovil.series.services.serie.ISeriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/series")
public class SeriesController {

    @Autowired
    ISeriesServices seriesServies;
    IAgeAware ageAwareServices;

    @GetMapping(value = "status")
    public String checkStatus(){
        return "ok";
    }

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public List<Series> listSeries() {
        //SingletonSeries s = SingletonSeries.getInstance();
        return seriesServies.findAll();
    }

    @GetMapping("/list/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Series detailSeries(@PathVariable(value = "id") Long id) {
        return seriesServies.findById(id);
    }

    @GetMapping("/list/recommended/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Series recommendedAge(@PathVariable(value = "id") Long id) {
        return ageAwareServices.getRecommendedAge(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateSeries(@PathVariable(value = "id") Long id, @RequestBody Series series) {
        Series seriesDB = null;
        seriesDB = seriesServies.findById(id);
        if (seriesDB != null) {
            seriesDB.setName(series.getName());
            seriesDB.setDescription(series.getDescription());
            seriesDB.setGender(series.getGender());
            seriesDB.setAgeRecommended(series.getAgeRecommended());
            seriesServies.updateSeries(seriesDB);

            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveSeries(@RequestBody Series series) {
        if (seriesServies.findByName(series) == null) {
            seriesServies.save(series);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSeries(@PathVariable(value = "id") Long id) {
        if (seriesServies.findById(id) != null) {
            seriesServies.deleteSeries(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }


}
