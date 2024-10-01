package edu.mx.uttt.vectores;

public class TestVectores {

    public static void main(String[] args) {

        //Declaración Vectores

        int tam = 4;

        int [] x = new int [3];
        System.out.println(x[1]);

        double y [] = new double [tam];
        System.out.println(y[3]);

        boolean z1 [];
        z1 = new boolean[4];
        System.out.println(z1[3]);

        char x1[], x2[], x3[];
        x1 = new char[tam];
        tam = 8;
        x2 = new char[tam];
        tam = 8;
        x3 = new char[tam];
        tam = 8;

        System.out.println(x2[2]); //Imprimir resultados

        String zz [] = {"Luis", "William", "Ezequiel", "Arcadia"};

        try {
            System.out.println(zz[3]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Error: "+ ex.getMessage());
        }

        zz [1] = "Mark";
        System.out.println(zz[1]);

        
                
        
    }
}
