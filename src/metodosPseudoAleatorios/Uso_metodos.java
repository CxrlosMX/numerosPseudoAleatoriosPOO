/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosPseudoAleatorios;

import javax.swing.JOptionPane;

/**
 *
 * @author El Camaleon
 */
public class Uso_metodos {

    public static void main(String[] args) {
        productoMedio producto = new productoMedio();
        cuadradoMedio cuadrado = new cuadradoMedio();
        int op = 0, a, b, resultado, largo, repetir;
        double centro;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "*-*-*-MENU-*-*-*\n1.-Metodo Producto Medio"
                        + "\n2.-Metodo Cuadrado Medio\n3.-Salir", "MENU", 3));
                switch (op) {
                    case 1: {
                        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la primera semilla", "Introduciendo semilla", JOptionPane.INFORMATION_MESSAGE));
                        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la segunda semilla", "Introduciendo semilla", JOptionPane.INFORMATION_MESSAGE));
                        if (producto.esIgual(a, b)) {
                            repetir = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tamaño de la tabla", "Introduciendo tamaño", JOptionPane.INFORMATION_MESSAGE));
                            System.out.println("*-*-*-METODO PRODUCTO MEDIO-*-*-*");
                            for (int i = 0; i < repetir; i++) {
                                resultado = producto.multiplicacion(a, b);
                                largo = producto.getLargo(resultado);
                                centro = producto.getCentro(resultado);
                                System.out.println("-------------------------");
                                System.out.println((i + 1));
                                System.out.println("Producto=" + a + "*" + b + "= " + resultado);
                                System.out.println(" Largo =" + largo);
                                System.out.println(" Centro = " + centro);
                                System.out.println(" RI  =" + producto.toString(centro));
                                a = b;
                                b = (int) centro;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Introduce valores con la misma cantidad de digitos", "Error al introducir semillas", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    }
                    case 2: {
                        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la semilla", "Introduciendo semilla", JOptionPane.INFORMATION_MESSAGE));
                        if (cuadrado.esValido(a)) {
                            repetir = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tamaño de la tabla", "Introduciendo tamaño", JOptionPane.INFORMATION_MESSAGE));
                            System.out.println("*-*-*-METODO CUADRADO MEDIO-*-*-*");

                            for (int i = 0; i < repetir; i++) {
                                resultado = cuadrado.getCuadrado(a);
                                largo = cuadrado.getLargo(resultado);
                                centro = cuadrado.getCentro(resultado);
                                System.out.println("-------------------------");
                                System.out.println(i);
                                System.out.println("Cuadrado= "+a + "*" + a + "=" + resultado);
                                System.out.println(" Largo =" + largo);
                                System.out.println(" Centro = " + centro);
                                System.out.println(" RI  =" + cuadrado.toString(centro));
                                a = (int) (centro);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Introduce una semilla con mas de 3 digitos", "Error al introducir semillas", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    }
                    case 3: {
                        JOptionPane.showMessageDialog(null, "Saliendo del programa", "Saliendo del programa", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Elige un opcion correcta por favor", "Error al elegir", JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (op != 3);

    }

}
