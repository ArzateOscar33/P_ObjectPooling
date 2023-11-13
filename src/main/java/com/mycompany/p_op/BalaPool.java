/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p_op;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arzate
 */
class BalaPool implements CustomObjectPool<Bala> {
    //creamos dos listas una para las balas disponibles y otra para las balas en uso 
    private List<Bala> availableBalas;
    private List<Bala> inUseBalas;
//creamos el constructor 
    public BalaPool() {
        //se crean las instancias de las listas 
        availableBalas = new ArrayList<>();
        inUseBalas = new ArrayList<>();
    }
//ya que es una implementacion , nuestra BalaPool implementa la funcion getObject(recordemos que debe de dar como retorno un objeto, en este caso una bala)
    @Override
    public Bala getObject() {
        //preguntamos si la lista esta vacia 
        if (availableBalas.isEmpty()) {
            // Si no hay balas disponibles, crea una nueva bala con su velocidad 
            Bala newBala = new Bala(10);
            //la agregamos a la lista de balas en uso 
            inUseBalas.add(newBala);
            //retornamos una nueva bala 
            return newBala;
        } else {
            // Si hay balas disponibles, toma la primera de la lista
            Bala bala = availableBalas.remove(0);
            //la agregamos a balas en uso 
            inUseBalas.add(bala);
            return bala;
        }
    }
//ahora debemos de eliminar de la lista la bala ya utilizada 
    @Override
    public void releaseObject(Bala bala) {
        //si se borra una bala de la lista de balas en uso esta misma bala se agrega a la lista de balas disponibles 
        if (inUseBalas.remove(bala)) {
            availableBalas.add(bala);
        }
    }
}