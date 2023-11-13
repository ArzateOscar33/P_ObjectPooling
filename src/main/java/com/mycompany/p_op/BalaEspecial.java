/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p_op;

/**
 *
 * @author Arzate
 */
//esta clase es una extension de la clase bala,aqui se pueden crear balas especiales(diferentes tipos de bala)
class BalaEspecial extends Bala {
    //agregamos el atributo tipo que define que tipo de bala es la que estamos creando 
    private String tipo;
//creamos su constructor, recordemos que es una extension de bala por lo que debe de tener el atributo de velocidad en su constructor
    public BalaEspecial(int velocidad, String tipo) {
        //recordemos que debemos de usar la palabra super en Java para referirnos a la clase base(EN ESTE CASO BALA),lo que significa que esta llamando al constructor
        //de Bala pasandole el parametro de velocidad
        super(velocidad);//
        //usamos esta linea para asignarle el valor del parametro tipo al ATRIBUTO tipo
        this.tipo = tipo;
    }
//como es una implementacion , la clase BalaEspecial hereda el metodo disparar de la clase Bala
    @Override
    public void disparar() {
        System.out.println("Bala especial de tipo '" + tipo + "' disparada a velocidad: " + super.velocidad);
    }
}