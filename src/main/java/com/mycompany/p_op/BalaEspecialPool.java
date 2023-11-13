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
class BalaEspecialPool implements CustomObjectPool<BalaEspecial> {
    private List<BalaEspecial> availableBalasEspeciales;
    private List<BalaEspecial> inUseBalasEspeciales;

    public BalaEspecialPool() {
        availableBalasEspeciales = new ArrayList<>();
        inUseBalasEspeciales = new ArrayList<>();
    }

    @Override
    public BalaEspecial getObject() {
        if (availableBalasEspeciales.isEmpty()) {
            // Si no hay balas especiales disponibles, crea una nueva bala especial
            BalaEspecial newBalaEspecial = new BalaEspecial(20, "Explosiva");
            inUseBalasEspeciales.add(newBalaEspecial);
            return newBalaEspecial;
        } else {
            // Si hay balas especiales disponibles, toma la primera de la lista
            BalaEspecial balaEspecial = availableBalasEspeciales.remove(0);
            inUseBalasEspeciales.add(balaEspecial);
            return balaEspecial;
        }
    }

    @Override
    public void releaseObject(BalaEspecial balaEspecial) {
        if (inUseBalasEspeciales.remove(balaEspecial)) {
            availableBalasEspeciales.add(balaEspecial);
        }
    }
}