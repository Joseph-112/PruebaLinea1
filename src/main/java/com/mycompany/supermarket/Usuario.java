/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermarket;

import java.util.ArrayList;

/**
 *
 * @author Joseph Trejos / nicolás Montagut
 */
public class Usuario implements Observado{

    /**
     * Lista de objetos que van a observar el comportamiento de usuario
     */
    private ArrayList<Observador> nucleos;
    private String nombreTarea="";

    /**
     * Constructor de la clase Usuario que inicializa la lista para sus 
     * observadores
     */
    public Usuario() {
        nucleos = new ArrayList<Observador>();
    }

    /**
     * Método que agrega observador a la lista
     * @param o 
     */
    public void agregarObservador(Observador o){
        nucleos.add(o);        
    }

    /**
     * Método que recibe y notifica a los observadores el nombre de la nueva
     * tarea que será ejecutada
     * @param nombreTarea 
     */
    public void ejecutarTarea(String nombreTarea){
        this.nombreTarea=nombreTarea;
        notificar();        
        System.out.println("======================");
    }
    
    /**
     * Método proveniente de la interface Observado 
     */
    @Override
    public void notificar() {
        for (Observador o:nucleos) {
            o.update();
        }
    }

    /**
     * Retorna el nombre de la tarea
     * @return 
     */
    public String getNombreTarea() {
        return nombreTarea;
    }

    /**
     * Método que establece nombre de la tarea
     * @param nombreTarea 
     */
    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }
}
