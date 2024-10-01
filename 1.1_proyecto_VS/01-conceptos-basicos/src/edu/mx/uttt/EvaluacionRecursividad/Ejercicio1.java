package edu.mx.uttt.EvaluacionRecursividad;

public class Ejercicio1 {
    private int n;

    public Ejercicio1(){
        this.n=1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if(n>0){
            this.n=n;
        }else{
            System.out.println("El valor no puede ser negativo");
            this.n=1;
        }
    }

    public long SumaPares(int n){
        if(n<=0){
            return n;
        }else{
            return n + (SumaPares(n)-1);
        }

        

    }

}

