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
public class NocambiaLongitud {
    
    private int valor;

    public void Visualizar(int i, final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
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
