/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

public class reto1 {


    public static double calcularPorcentajeBono(int anios,float bono) {
       
       double porcentaje=0;
       
       if (anios>=10){
         porcentaje =0.30;
       }
       if (anios>=5){
         porcentaje =0.20;
       }
       if (anios>=3 && anios<5){
         porcentaje =0.10;
       }
       if (anios<3){
         porcentaje =0.5;
       }
       return porcentaje*bono;
    }
}