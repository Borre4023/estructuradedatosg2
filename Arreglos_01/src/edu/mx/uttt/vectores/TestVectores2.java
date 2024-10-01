package edu.mx.uttt.vectores;

import javax.swing.JOptionPane;

public class TestVectores2 {

    public static void main(String[] args) {

        int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce  el tamaño del arreglo"));
        double estaturas [] = new double[tam];
        imprimir(estaturas);

    }

    public static void imprimir(double arr []) {
        for (int i = 0; i <arr.length ; i++){
            System.out.print(arr[i]+ "->");
        }
    }

    public static void llenarArreglo(double arr []) {
        int i = 0;
        while( i <= arr.length){
            arr[i] = Double.parseDouble(
                JOptionPane.showInputDialog("Introduce el valor del arreglo [" + (i+1)+ "]"));
            i++;
        }
        
    }

   








}
