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
public class NucleosPC implements Observador{

    private Usuario observado;
    
    /**
     * Constructor que recibe el objeto al cuál tendrá que observar
     * @param observado 
     */
    public NucleosPC(Observado observado) {
        this.observado = (Usuario) observado;
    }
            
    /**
     * Método proveniente de la interface Observador, se encargará de obtener
     * la tarea que le fue asignada al núcleo
     */
    @Override
    public void update() {
        //Impresión de la lista de productos del inventario insertados por el administrador
        System.out.println("Tareas:");
        System.out.println(observado.getNombreTarea());
        
    }
    
}
