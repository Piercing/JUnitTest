/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea08.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author merlosalbarracin@gmail.com
 */
public class UsuarioTest {

    Usuario usuario;

    @Test
    public void testGetIdErroneo() {
        System.out.println("getIdUsuario");
        usuario = new Usuario("Carlos", "123");
        String expResult = "Carlos";
        String result = usuario.getIdUsuario();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetClaveErronea() {
        System.out.println("getClave");
        usuario = new Usuario("Carlos", "123");
        String expResult = "123";
        String result = usuario.getClave();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        usuario = new Usuario("Pepe", "789");
        String idUsuario = "Carlos";
        usuario.setIdUsuario(idUsuario);
    }

    @Test
    public void testSetClave() {
        System.out.println("setClave");
        usuario = new Usuario("Pepe", "789");
        String clave = "555";
        usuario.setClave(clave);
    }
}
