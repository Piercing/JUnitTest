package com.tarea01.utilidades;

/**
 *
 * @author merlosalbarracin@gmail.com
 * @version 1.0
 */
public class Datos {

    private final int maxUsus = 50;
    private final Usuario misUsuarios[] = new Usuario[maxUsus];
    private int contaUsuarios = 0;

    public Datos() {
        Usuario miUsuario;
        miUsuario = new Usuario("Carlos", "123");
        //Añadimos el usuario creado al array en la posición cero (primera)
        misUsuarios[contaUsuarios] = miUsuario;
        //aumentamos el contador en uno
        contaUsuarios++;
        miUsuario = new Usuario("Pepe", "321");
        //Añadimos el usuario creado al array 
        misUsuarios[contaUsuarios] = miUsuario;
        //aumentamos el contador en uno
        contaUsuarios++;
    }

    public int numeroUsuarios() {
        return contaUsuarios;
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
            if (misUsuarios[i].getIdUsuario().equalsIgnoreCase(usuario)
                    && misUsuarios[i].getClave().equals(clave)) {
                return !aux;
            }
        }
        return aux;
    }
}
