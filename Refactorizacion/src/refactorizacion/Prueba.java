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
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class Prueba {
    
    public int valor;
//metodo que modifica el contenido de la posicion posicion de un array con el valor pasado

    public void modificar(int[] vector) {
        int LongitudAcctual = 0;
        int i;
        int posicion = 1;
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (posicion < vector.length) {
//mostramos su contenido
System.out.println("Elemento a modificar=" + vector[posicion]);
vector[posicion] = this.valor;
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    public void borrar(int[] v) {
        int LongitudAcctual = 0;
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < v.length) {
            System.out.println("Elemento a borrar=" + v[p]);
            for (i = p; i < v.length - 1; i++) {
                v[i] = v[i + 1];
            }
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los
   // elementos

    public void insertar(int[] v) {
        int LongitudAcctual = 0;
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < v.length) {
            System.out.println("Elemento a insertar=" + this.valor);
            for (i = v.length - 1; i > p; i--) {
                v[i] = v[i - 1];
            }
            v[p] = this.valor;
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }



}
//+++++++++++++++++++++++++++++++++++
