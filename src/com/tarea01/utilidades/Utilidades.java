package com.tarea01.utilidades;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase con distintos métodos para conversión y comprobación de datos
 *
 * @author Juan Carlos  <merlosalbarracin at gmail.com>
 * @version 1.0.0
 * @since 14/12/2015
 */
public class Utilidades {

    /**
     * Método que devuelve un booleano, convierte un String a Float si lo puede
     * convertir devuelve true, sino devuelve false.
     *
     * @param cadena
     * @return booleano
     */
    public static boolean isNumeric(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * Método que devuelve una fecha con un formato específico
     *
     * @param date
     * @return fechaConFormato
     */
    public static String formatoFecha(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaConFormato = sdf.format(date);
        return fechaConFormato;
    }

    /**
     * Método que devuelve un objeto convertido a tipo Integer
     *
     * @param Obj
     * @return NumInt
     */
    public static int objectToInt(Object Obj) {
        int NumInt = Integer.parseInt(objectToString(Obj));
        return NumInt;
    }

    /**
     * Método que devuelve un objeto convertido a tipo Floar
     *
     * @param Obj
     * @return NunDoble
     */
    public static double objectToDouble(Object Obj) {
        String Str = Obj.toString();
        double NumDouble = Double.parseDouble(Str);
        return NumDouble;
    }

    /**
     * Método que devuelve un objeto convertido a tipo Float
     *
     * @param Obj
     * @return NumFloat
     */
    public static float objectToFloat(Object Obj) {
        String Str = Obj.toString();
        float NumFloat = Float.parseFloat(Str);
        return NumFloat;
    }

    /**
     * Método que convierte un objeto a String y comprueba si ese objeto
     * convertido a String es de tipo booleano
     *
     * @param Obj
     * @return boolean
     */
    public static boolean objectToBoolean(Object Obj) {
        String CadBooleana = objectToString(Obj);
        Boolean booleano = Boolean.valueOf(CadBooleana);
        return booleano;
    }

    /**
     * Método que devuelve un objeto convertido en un String
     *
     * @param Obj
     * @return Str
     */
    public static String objectToString(Object Obj) {
        String Str = "";
        if (Obj != null) {
            Str = Obj.toString();
        }
        return Str;
    }

    /**
     * Método que devuelve un float convertido en String con salida de tres
     * decimales
     *
     * @param miFloat
     * @return
     */
    public static String decimalFormat(Float miFloat) {
        DecimalFormat df = new DecimalFormat("0.000");
        return df.format(miFloat);
    }

    /**
     * Método que devuelve un String convertido a float con salida de tres
     * decimales
     *
     * @param miString
     * @return
     */
    public static Float stringAFloat(String miString) {
        float valor = 0;
        try {
            DecimalFormat formateador = new DecimalFormat("0.000");
            Number numero = formateador.parse(miString);
            valor = numero.floatValue();
        } catch (ParseException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }

    /**
     * Comprueba que el teléfono pasado como parámetro tiene el formato correcto
     *
     * @param telefono El teléfono cuya validez hay que comprobar.
     * @return true si <code>telefono</code> el teléfono es válido y false si no
     * lo es.
     */
    public static boolean compruebaTelefono(String telefono) {
        Pattern p = Pattern.compile("[6-9]\\d{8}"); //números de 9 cifras que empiezan por 6,7,8 o 9
        Matcher m = p.matcher(telefono);
        return m.matches();
    }

    /**
     * Comprueba que el argumento es un NIF o NIE correcto
     *
     * @param nifONie
     * @return true si <code>nifONie</code> es un NIF/NIE válido y false si no
     * lo es.
     */
    public static boolean validarNifONie(String nifONie) {

        Pattern p = Pattern.compile("([\\dXxYyZz])(\\d{7})([a-zA-Z])");
        Matcher m = p.matcher(nifONie);
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        boolean correcto = false;
        String dniEquivalente;
        int dni;

        if (m.matches()) {
            //convertir primera letra de Nie a número
            switch (m.group(1).charAt(0)) {
                case 'x':
                case 'X':
                    dniEquivalente = "0" + m.group(2);
                    break;
                case 'y':
                case 'Y':
                    dniEquivalente = "1" + m.group(2);
                    break;
                case 'z':
                case 'Z':
                    dniEquivalente = "2" + m.group(2);
                    break;
                default:
                    dniEquivalente = m.group(1) + m.group(2);
            }
            //aquí tenemos en dni una cadena con el nº de DNI o equivalente
            dni = Integer.parseInt(dniEquivalente);
            //si el carácter al final del DNI/NIF en mayúsculas  
            // coincide con el que obtenemos de la cadena letrasDni.
            if (letrasDni.charAt(dni % 23) == m.group(3).toUpperCase().charAt(0)) {
                correcto = true; //solo se llega aquí si el patrón coincide y si la letra final es correcta
            }
        } //fin if formato correcto
        return correcto;
    } //fin validarNifONie

}