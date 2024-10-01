package edu.mx.uttt.ejercicios;

public class VectoresInversos {

        // Variables de instancia

        private int[] vector;
        private int tamanioo;
    
        // Constructor

        public VectoresInversos(int tamanio) {
            if (tamanio > 0) {
                this.tamanioo = tamanio;
                vector = new int[tamanio];
            } else {

                // Tamaño si no sale bien la cosa

                this.tamanioo = 1;  
                vector = new int[1];
            }
        }
    
        // Setters

        public void setVector(int[] vector) {
            if (vector.length == this.tamanioo) {
                this.vector = vector;
            } else {
                System.out.println("Error: el tamaño del vector no coincide con el tamaño establecido.");
            }
        }
    
        // Getters

        public int getTamanio() {
            return this.tamanioo;
        }
    
        public int[] getVector() {
            return vector;
        }
    
        // Método para invertir el vector

        public int[] invertirVector() {
            int[] vectorInvertido = new int[tamanioo];
            for (int i = 0; i < tamanioo; i++) {
                vectorInvertido[i] = vector[tamanioo - 1 - i];  // Hacer la inversión 
            }
            return vectorInvertido;
        }
    
        //imprimir el resultado

        public void imprimirVector(int[] vector) {
            System.out.print("l");
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i]);
                if (i < vector.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("I");
        }
    }

