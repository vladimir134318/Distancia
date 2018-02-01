package com.bitmix;

public class Punto {

        double puntox ;
        double puntoy ;

        public Punto(double x, double y){
            puntox = x ;
            puntoy = y ;
        }

        public double distancia(Punto b){
            double dif = Math.sqrt((Math.pow((b.puntox - this.puntox), 2)+(Math.pow((b.puntoy - this.puntoy), 2))));
            return dif;
        }


}
