/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package refactorizacion;

/**
 *
 * @author jose
 */
public class Refactorizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] v = new int[5];
        v[0] = 2;
        v[1] = 4;
        v[2] = 6;
        v[3] = 8;
        Prueba p = new Prueba();
        p.valor = 10;
        p.modificar(v);
        p.borrar(v);
        p.insertar(v);
    }

}
