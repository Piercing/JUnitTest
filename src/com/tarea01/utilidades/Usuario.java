package com.clases.CostesCarta;

/**
 *
 * @author Pablo && Carlos Company
 * @version 1.0 15/06/2015
 */
public class Usuario {

    private String idUsuario;
    private String nombres;
    private String apellidos;
    private String clave;
    private int perfil;

    public Usuario(String idUsuario, String nombres,
            String apellidos, String clave, int perfil) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.clave = clave;
        this.perfil = perfil;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getClave() {
        return clave;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

}
