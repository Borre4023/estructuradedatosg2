package edu.mx.uttt.ejercicios;

public class VectorEscalar {

    // Variables de instancia

    private int[] v1;
    private int[] v2;
    private int tamanio;

    // Constructor

    public VectorEscalar(int tamanio) {
        if (tamanio > 0) {
            this.tamanio = tamanio;
            v1 = new int[tamanio];
            v2 = new int[tamanio];
        } else {
            this.tamanio = 1;  // Tamaño predeterminado si es inválido
            v1 = new int[1];
            v2 = new int[1];
        }
    }

    // Setters
    public void setV1(int[] v1) {
        if (v1.length == this.tamanio) {
            this.v1 = v1;
        } else {
            System.out.println("Error: el tamaño del vector no coincide con el tamaño establecido.");
        }
    }

    public void setV2(int[] v2) {
        if (v2.length == this.tamanio) {
            this.v2 = v2;
        } else {
            System.out.println("Error: el tamaño del vector no coincide con el tamaño establecido.");
        }
    }

    // Getters
    public int getTamanio() {
        return this.tamanio;
    }

    public int[] getV1() {
        return v1;
    }

    public int[] getV2() {
        return v2;
    }

    // Método para calcular el producto escalar

    public int productoEscalar() {
        if (v1.length != v2.length) {
            System.out.println("Los vectores deben tener el mismo tamaño.");
        }

        int productoEscalar = 0;
        for (int i = 0; i < tamanio; i++) {
            productoEscalar += v1[i] * v2[i];
        }
        return productoEscalar;
    }

    //imprmimir

    public void imprimirVector(int[] vector) {
        System.out.print("-");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("-");
    }
}

