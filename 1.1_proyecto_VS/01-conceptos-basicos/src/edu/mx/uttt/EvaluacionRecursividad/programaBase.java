package edu.mx.uttt.EvaluacionRecursividad;
import javax.swing.JOptionPane;
public class programaBase {
public static void main(String[] args) {

    JOptionPane.showInputDialog(null, "Introduce un dígito");

    Ejercicio1 SumaPar = new Ejercicio1();

    System.out.println("La suma de los primeros " + SumaPar.getN() + " números pares es: " + SumaPar.SumaPares(SumaPar.getN()));
}

}