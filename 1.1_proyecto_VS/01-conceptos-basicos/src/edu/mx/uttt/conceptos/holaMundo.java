package edu.mx.uttt.conceptos;

public class holaMundo {

    public void imprimir(int n){
        //Caso BASE
        if (n == 1){
            System.out.println("Hola Mundo");
        } else {
        //Caso GENERAL
            System.out.println("Hola Mundo");
            imprimir(n-1);
        }
    }
}
