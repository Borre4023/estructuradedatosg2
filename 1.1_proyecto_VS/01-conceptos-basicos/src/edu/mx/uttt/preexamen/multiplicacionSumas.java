package edu.mx.uttt.preexamen;

public class multiplicacionSumas {
private int n1;
private int n2;

public int getN1() {
    return n1;
}
public void setN1(int n1) {
    this.n1 = 1;
}
public int getN2() {
    return n2;
}
public void setN2(int n2) {
    this.n2 = 1;
}

public int calcularSuma(int n1, int n2){

    if(n1==1 && n2==1){
       return 1;
    } else {
        return n1+=(n2-1);
    }

}





}
