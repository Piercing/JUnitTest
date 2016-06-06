/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea01di.formularios;

import com.tarea08.model.Datos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author merlosalbarracin@gmail.com
 */
public class frmLoginTest {
    
    public frmLoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setDatos method, of class frmLogin.
     */
    @Test
    public void testSetDatos() {
        System.out.println("setDatos");
        Datos misDatos = null;
        frmLogin login = new frmLogin();
        login.setDatos(misDatos);
    }

    /**
     * Test of main method, of class frmLogin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        frmLogin.main(args);
    }
    
}
