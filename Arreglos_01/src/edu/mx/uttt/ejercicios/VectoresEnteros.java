package edu.mx.uttt.ejercicios;

public class VectoresEnteros {

    //Variables de instancia

    private int [] v1;
    private int [] v2;
    private int tamanio;

    //Contructor

    public VectoresEnteros(int tamanio){
        if (tamanio > 0){
            v1 = new int [tamanio];
            v2 = new int [tamanio];
        } else {
            v1 = new int [1];
            v2 = new int [10];
        }
    }

    //Setters

    public void setV1(int v1[]) {
        if (v1.length == tamanio){
            for(int i = 0; i<v1.length; i++){
                this.v1[i] = v1[i];
            }
            
        }
    }

    public void setV2(int[] v2) {
        if (v1.length == tamanio){
            for(int i = 0; i<v2.length; i++){
                this.v2[i] = v2[i];
    }
    }
}
    
    //Getters

    public int getTamanio() {
        return this.tamanio;
    }

    public int[] getV1() {
        return v1;
    }

    public int[] getV2() {
        return v2;
    }

    // Método para sumar los vectores

    public int[] sumarVectores() {
        if (v1.length != v2.length) {
            System.out.print("Los vectores deben tener el mismo tamaño.");
        }

        int[] resultado = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }

    // Método para imprimir un vector

    public void imprimirVector(int[] vector) {
        System.out.print("I");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("I");
    }


    
}

