package com.areamovil.series.singleton;

import java.io.Serializable;

public class SingletonSeries implements Serializable {

    private static SingletonSeries INSTANCE;

    private SingletonSeries(){}

    public synchronized static SingletonSeries getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SingletonSeries();
            System.err.println(INSTANCE);
        }
        return INSTANCE;
    }

    private Object readResolved(){
        System.err.println("Singleton");
        return INSTANCE;
    }

    /*public String seriesReconmmended(){
        return "LA CASA DE PAPEL";
    }*/
}
