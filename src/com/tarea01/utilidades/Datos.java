package com.tarea01.utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  Carlos Company
 * @version 1.0 15/06/2015
 */
public class Datos {

    private final int maxUsus = 50;
    private final int maxProduc = 100;
    private final Usuario misUsuarios[] = new Usuario[maxUsus];
    private int contaUsuarios = 0;
    private int contaProduc = 0;
    private int numReporte = 0;

   

    public Datos() {
        Usuario miUsuario;
        miUsuario = new Usuario("yo", "Juan Carlos",
                "Merlos Albarracín", "123", 1);
        //Añadimos el usuario creado al array en la posición cero (primera)
        misUsuarios[contaUsuarios] = miUsuario;
        //aumentamos el contador en uno
        contaUsuarios++;
        miUsuario = new Usuario("tu", "Juan Carlos",
                "Merlos Albarracín", "123", 2);
        //Añadimos el usuario creado al array en la posición cero (primera)
        misUsuarios[contaUsuarios] = miUsuario;
        //aumentamos el contador en uno
        contaUsuarios++;


        

        //Cargamos configuración
        cargarConfiguracion();
    }

    public void grabarTodo() {
        grabarConfiguracion();
    }

    public int getNumReporte() {
        return numReporte;
    }

    public void setNumReporte(int numReporte) {
        this.numReporte = numReporte;
    }

    public int numeroUsuarios() {
        return contaUsuarios;
    }

    public int numeroProductos() {
        return contaProduc;
    }

    public Usuario[] getUsuarios() {
        return misUsuarios;
    }


    /**
     * Método que comprueba los datos del usuario
     *
     * @param usuario
     * @param clave
     * @return
     */
    public boolean validarUsuario(String usuario, String clave) {

        boolean aux = false;
        for (int i = 0; i < contaUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario)
                    && misUsuarios[i].getClave().equals(clave)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que comprueba el perfil del usuario
     *
     * @param usuario
     * @return
     */
    public int getPerfil(String usuario) {
        for (int i = 0; i < contaUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario)) {
                return misUsuarios[i].getPerfil();
            }
        }
        return -1;
    }

    /**
     * Método que permite hacer el cambio de clave del usuario
     *
     * @param usuario
     * @param clave
     */
    public void cambioClave(String usuario, String clave) {
        for (int i = 0; i < contaUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario)) {
                misUsuarios[i].setClave(clave);
                return;
            }
        }
    }

    public int posicionUsuario(String usuario) {

        for (int i = 0; i < contaUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario)) {
                return i;
            }
        }
        return -1;
    }

 

    public String insertarUsuarios(Usuario miUsuario) {
        if (contaUsuarios == maxUsus) {
            return "Se ha alcanzado el número máximo de usuarios";
        }
        misUsuarios[contaUsuarios] = miUsuario;
        contaUsuarios++;
        return "Usuario insertado correctamente";
    }

 

    public String modificarUsuario(Usuario miUsuario, int pos) {

        misUsuarios[pos].setNombres(miUsuario.getNombres());
        misUsuarios[pos].setApellidos(miUsuario.getApellidos());
        misUsuarios[pos].setClave(miUsuario.getClave());
        misUsuarios[pos].setPerfil(miUsuario.getPerfil());
        return "Usuario modificado correctamente";
    }


    public String borrarUsuario(int pos) {

        for (int i = pos; i < contaUsuarios - 1; i++) {
            misUsuarios[i] = misUsuarios[i + 1];
        }
        contaUsuarios--;
        return "Usuario borrado correctamente";
    }

  

    /**
     * Método que carga la configuración del archivo .ini
     */
    public void cargarConfiguracion() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("Data/configuracion.ini");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("ReporteActual=")) {
                    numReporte = new Integer(linea.substring(14));
                }
            }
        } catch (IOException | NumberFormatException e) {
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * Método que graba la configuración en el archivo .ini
     */
    public void grabarConfiguracion() {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("Data/configuracion.ini");
            pw = new PrintWriter(fw);

            pw.println("[General]");
            pw.println("ReporteActual=" + numReporte);
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
