package edu.mx.uttt.iterativos;

// ::: PROGRAMA PARA CALCULAR EL FACTORIAL DE UN NUMERO ENTERO :::

// 1. Realizar la validación para que la variable de instancia nunca sea cero
// 2. Realizar un metodo que calcule el factorial, utilizando un ciclo factorial
// 3. Realizar un metodo que calcule el factorial, de forma inversa utilizando un while
// Ejemplo: Factorial

// f(1)=1
// f(2)=1*2
// f(3)=1*2*3
// f(4)=1*2*......n

// f(1)=1
// f(2)=2*1
// f(3)=3*2*1
// f(n)=n......*3*2*1

public class Factorial {

    private int n;

    public Factorial(){
        this.n=1;
    }

    public Factorial(int n) {

        this.n = (n<=0)?1:n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n<=0)?1:n;
    }

    public long calcular(){
        long fact =1;
     for(int i=1;i<=n;i++){
        fact*=i;   //fact = fact * 1
     }
    
     return fact;
    
    }

    public long calcularReverse(){
        long fact = 1;
        int i = n;
        while(i>=1){
            fact*=i;
            i--;
        }
        return fact;
    }

    @Override
    public String toString(){
            return "El factorial ("+ this.n + ") = " + this.calcular();
    }



    


}
