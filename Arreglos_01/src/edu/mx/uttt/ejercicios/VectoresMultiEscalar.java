package edu.mx.uttt.ejercicios;

public class VectoresMultiEscalar {

     // Variables de instancia

     private int[] vector;
     private int tamanio;
 
     // Constructor

     public VectoresMultiEscalar(int tamanio) {
         if (tamanio > 0) {
             this.tamanio = tamanio;
             vector = new int[tamanio];
         } else {
             this.tamanio = 1;  // Tamaño predeterminado si es inválido
             vector = new int[1];
         }
     }
 
     // Setters
     public void setVector(int[] vector) {
         if (vector.length == this.tamanio) {
             this.vector = vector;
         } else {
             System.out.println("Error: el tamaño del vector no coincide con el tamaño establecido.");
         }
     }
 
     // Getters
     public int getTamanio() {
         return this.tamanio;
     }
 
     public int[] getVector() {
         return vector;
     }
 
     // Método para construir lo imposible durante la clase

     public int[] multiplicarPorEscalar(int escalar) {
         int[] resultado = new int[tamanio];
         for (int i = 0; i < tamanio; i++) {
             resultado[i] = vector[i] * escalar;  // Multiplicar cada elemento por el escalar
         }
         return resultado;
     }
 
     // Método para imprimir un vector
     public void imprimirVector(int[] vector) {
         System.out.print("..");
         for (int i = 0; i < vector.length; i++) {
             System.out.print(vector[i]);
             if (i < vector.length - 1) {
                 System.out.print(", ");
             }
         }
         System.out.println("..");
     }
 }


