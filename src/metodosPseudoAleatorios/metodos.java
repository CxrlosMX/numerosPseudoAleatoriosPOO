/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosPseudoAleatorios;

import java.text.DecimalFormat;

/**
 *
 * @author El Camaleon
 */
public class metodos {

    DecimalFormat formateador = new DecimalFormat("");

    //Obtener largo
    public int getLargo(int numero) {
        int n = Integer.toString(numero).length();
        return n;
    }

    //Metodo para obtener el centro de nuestro numero
    public double getCentro(int numero) {
        double centro;
        String n1 = Integer.toString(numero);

        String n2;

        if (n1.length() <= 7) {
            n2 = n1.substring(1, 5);

            centro = Integer.parseInt(n2);

            return centro;
        } else {
            n2 = n1.substring(2, 6);
            centro = Integer.parseInt(n2);

            return centro;
        }

    }

    //Obtener ri
    public String toString(double numero) {

        return "0." + formateador.format(numero);
    }

}
