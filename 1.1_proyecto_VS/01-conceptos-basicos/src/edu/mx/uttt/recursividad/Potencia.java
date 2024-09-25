package edu.mx.uttt.recursividad;
import javax.swing.JOptionPane;

public class Potencia {
    private int n;

    public int getN() {
        return n;
    }

    public void setN() {
        this.n = n;
    }

    public int calPot(int n){
        if(n<=1){
            return n;
        }else{
            return calPot(n*2)-n;
        }
        
    }
}
