/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermarket;

/**
 *
 * @author Joseph Trejos / nicolás Montagut
 */
public class SuperMarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Usuario nicolas = new Usuario();
        //Usuario joseph = new Usuario();

        /*
        Núcleos que estarán observando las acciones del usuario
         */
        NucleosPC ryzen7 = new NucleosPC(nicolas);
        NucleosPC ryzen9 = new NucleosPC(nicolas);
        NucleosPC ryzen5 = new NucleosPC(nicolas);

        //NucleosPC ryzen9 = new NucleosPC(joseph);
        /*
        objeto de tipo Usuario agregando nucleos a la lista de observadores
         */
        nicolas.agregarObservador(ryzen7);
        nicolas.agregarObservador(ryzen9);
        nicolas.agregarObservador(ryzen5);
        //joseph.agregarObservador(ryzen9);

        nicolas.ejecutarTarea("Excel");
        nicolas.ejecutarTarea("Paint");
        nicolas.ejecutarTarea("Word");
        //joseph.ejecutarTarea("Word");
    }

}
