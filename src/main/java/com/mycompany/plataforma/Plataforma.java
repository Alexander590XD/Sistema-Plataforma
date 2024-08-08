/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plataforma;

/**
 *
 * @author pato4
 */
public abstract class Plataforma {

     protected String nombre;

    public Plataforma() {
        // Constructor vacío
    }

    public Plataforma(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarInfo();
   
    public void mostrarPlataforma() {
        System.out.println("Nombre de la Plataforma: " + nombre);
    }
}

