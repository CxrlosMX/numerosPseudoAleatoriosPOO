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
public class productoMedio extends metodos {

    private int n1;
    private int n2;

    public productoMedio() {

    }
     //Metodo para verificar que las dos semillas tengan los mismo digitos
    public boolean esIgual(int a, int b){
    return super.getLargo(a)==getLargo(b);
    
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //Multiplicacion

    public int multiplicacion(int a, int b) {
        return a * b;
    }

}
