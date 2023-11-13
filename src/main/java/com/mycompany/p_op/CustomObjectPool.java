/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.p_op;

/**
 *
 * @author Arzate
 */
//creamos la interface con un parametro generico T
interface CustomObjectPool<T> {
    // creamos el la funcion T llamada getObject 
    T getObject();
    //creamos el metodo liberear objeto
    void releaseObject(T obj);
}
