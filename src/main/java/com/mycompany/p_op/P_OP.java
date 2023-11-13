/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p_op;

/**
 *
 * @author Arzate
 */
public class P_OP {

    public static void main(String[] args) { // Obtiene una instancia del ObjectPool para objetos de tipo Conexion
       BalaPool balaPool = new BalaPool();
        BalaEspecialPool balaEspecialPool = new BalaEspecialPool();

        // Simulación de disparo de balas
        Bala bala1 = balaPool.getObject();
        bala1.disparar();

        BalaEspecial balaEspecial1 = balaEspecialPool.getObject();
        balaEspecial1.disparar();

        // Liberar balas después de su uso
        balaPool.releaseObject(bala1);
        balaEspecialPool.releaseObject(balaEspecial1);

        // Simulación de disparo de balas nuevamente
        Bala bala2 = balaPool.getObject();
        bala2.disparar();

        BalaEspecial balaEspecial2 = balaEspecialPool.getObject();
        balaEspecial2.disparar();

        // Liberar balas después de su uso
        balaPool.releaseObject(bala2);
        balaEspecialPool.releaseObject(balaEspecial2);
    }
}