package com.ejercicio18;

import java.util.ArrayList;

public class Ejecutable {

    public static void main(String[] args) {
        ArrayList<Serie> arrSeries = new ArrayList<>();
        ArrayList<VideoJuego> arrVideoJuegos = new ArrayList<>();

        arrSeries.add(new Serie());
        arrSeries.add(new Serie("Batman","Mark"));
        arrSeries.add(new Serie("Spiderman","Jhon"));
        arrSeries.add(new Serie("Juego de Tronos",8,"Fantasia","WB studio"));
        arrSeries.add(new Serie("Harry Potter",9,"Fantasia","Pepito"));

        arrVideoJuegos.add(new VideoJuego());
        arrVideoJuegos.add(new VideoJuego("Dota",6));
        arrVideoJuegos.add(new VideoJuego("League of legends",5));
        arrVideoJuegos.add(new VideoJuego("Rust",8,"Supervivencia","FacePunch"));
        arrVideoJuegos.add(new VideoJuego("Mortal Kombat",6,"pelea","ni idea"));

        arrSeries.get(1).entregar();
        arrSeries.get(2).entregar();

        arrVideoJuegos.get(1).entregar();
        arrVideoJuegos.get(2).entregar();

        Serie serieAux = null;
        int contSeriesEntregadas = 0;
        for(Serie series : arrSeries){
            for (Serie seriesPos2 : arrSeries){
                if(series.compareTo(seriesPos2) == 0){
                    serieAux = seriesPos2;
                }
            }
            if(series.isEntregado()){
                contSeriesEntregadas++;
                series.devolver();
            }
        }

        VideoJuego juegoAux = null;
        int contJuegosEntregados = 0;
        for(VideoJuego juegos : arrVideoJuegos){
            for (VideoJuego juegosPos2 : arrVideoJuegos){
                if(juegos.compareTo(juegosPos2)== 0){
                    juegoAux = juegosPos2;
                }
            }
            if (juegos.isEntregado()){
                contJuegosEntregados++;
                juegos.devolver();
            }
        }

        System.out.println(juegoAux);
        System.out.println(serieAux);

        System.out.println("juegos entregados: "+contJuegosEntregados);
        System.out.println("series entregadas: "+contSeriesEntregadas);


    }
}
