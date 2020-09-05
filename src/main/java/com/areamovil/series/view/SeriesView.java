package com.areamovil.series.view;

import com.areamovil.series.controllers.SeriesController;
import com.areamovil.series.entity.Series;
import com.areamovil.series.singleton.SingletonSeries;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SeriesView {


    /* VARIABLE GLOBAL */

    @Autowired
    SeriesController seriesController = new SeriesController();

    public void save(){
        List<Series> series = new ArrayList<>();
        series = seriesController.listSeries();
        System.out.println(series);
        SingletonSeries s = SingletonSeries.getInstance();
        //s.seriesReconmmended();
    }
}
