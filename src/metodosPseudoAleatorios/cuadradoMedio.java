/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosPseudoAleatorios;

/**
 *
 * @author El Camaleon
 */
public class cuadradoMedio extends metodos {

    private int n1;

    public cuadradoMedio() {

    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getCuadrado(int a) {
        int r = (int) Math.pow(a, 2);
        return r;
    }

    public boolean esValido(int numero) {
        return super.getLargo(numero) > 3;
    }

}
