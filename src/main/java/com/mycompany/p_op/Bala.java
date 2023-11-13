/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p_op;

/**
 *
 * @author Arzate
 */
public class Bala {
    //Creamos los atributos de la bala, en este caso sabemos que debe de llevar una velocidad 
     int velocidad;
//creamos su constructor
    public Bala(int velocidad) {
        this.velocidad = velocidad;
    }
//creamos el metodo disparar , el cual por el momento solo nos imprime el mensaje y el valor de la velocidad de la bala 
    public void disparar() {
        System.out.println("Bala disparada a velocidad: " + velocidad);
    }
}