package edu.mx.uttt.iterativos;

public class Serie {
    private int n;

    public Serie (){
        this.n = 1;
    }

    public Serie(int n){
        this.n=(n>0)?n:1;
        
        // if(n>0){
        //     this.n=n;
        // }else{
        //     this.n=n;
        // }

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if(n>0){
            this.n=n;
        }else{
            System.out.println("El valor de n no puede ser negativo ni cero");
            this.n=1;
        }
    }

    public double calcularSerie(){
        int i= 1;
        double r=0;
        while (i<=this.n){
            r+=1.0/i;
            i++;
        }
        return r;
    }


    
}
