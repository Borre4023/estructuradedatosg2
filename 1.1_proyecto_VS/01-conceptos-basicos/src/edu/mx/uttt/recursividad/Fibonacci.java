package edu.mx.uttt.recursividad;

public class Fibonacci {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = 1;
    }

    public int calFib(int n){
        //Caso Base
        //return (n<=1)?n:calFib(n-1) + calFib(n-2);

        if(n<=1){
            return n;
        }else{
            return calFib(n-1) + calFib(n-2);
        }


    }

    

}
