package edu.mx.uttt.iterativos;

public class Potencia {
//Valores de Instancia
    private int n;
    private Potencia potencia;

    //1er Constructor
    public Potencia(){
        this.n=1;
        potencia = new Potencia();
    }
    //2do Constructor (validar)
    public Potencia(int n){
        this.n = (n<=0)?1:n;
    }

    //Getters and Setters
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public Potencia getPotencia() {
        return potencia;
    }
    public void setPotencia(Potencia potencia) {
        this.potencia = potencia;
    }

    //1er modelo FOR
    public double calcularPotenciaFor(){
        double r = 0.0;
    
        for(int i = 0; i<=this.n;++i){
            potencia.setN(i);
            r*= i/potencia.calcularPotenciaFor();
        }
        return r;
    }

    //2do modelo WHILE
    //public double calcularPotenciaWhile(){
    //    double r = 0.0;
    
        
    //}

    //3er Modelo DO-WHILE
    //public double calcularPotenciaDoWhile(){
    //    double r = 0.0;
    
        
    //}

    



}
