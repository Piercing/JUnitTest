/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea08.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author merlosalbarracin@gmail.com
 */
public class DatosTest {
    


    /**
     * Test of validarUsuario method, of class Datos.
     */
    @Test
    public void testValidarUsuario() {
        System.out.println("validarUsuario");
        String usuario = "Carlos";
        String clave = "123";
        Datos datos = new Datos();
        boolean expResult = true;
        boolean result = datos.validarUsuario(usuario, clave);
        assertEquals(expResult, result);
    }
    
}
