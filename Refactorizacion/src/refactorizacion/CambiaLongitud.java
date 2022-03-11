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
public class CambiaLongitud extends NewClass {
    
    private int valor;

//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    public void borrar(int[] vector) {
        int LongitudAcctual = 0;
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < longitud) {
            System.out.println("Elemento a borrar=" + vector[p]);
            for (i = p; i < longitud - 1; i++) {
                vector[i] = vector[i + 1];
            }
        }
//Mostramos los elementos del array
        Visualizar(i, longitud, vector);
    }
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los
   // elementos
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los
   // elementos

     public void insertar(int[] vector) {
        int LongitudAcctual = 0;
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > p; i--) {
                vector[i] = vector[i - 1];
            }
            vector[p] = this.getValor();
        }
        Visualizar(i, longitud, vector);
    }


    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }



}
//+++++++++++++++++++++++++++++++++++
