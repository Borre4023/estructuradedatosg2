package edu.mx.uttt.recursividad;

import javax.swing.JOptionPane;

public class TestRecursividad {
    public static void main(String[] args) {
        ejecutar();
    }
    public static String menu(){
        String menu= "Menu Principal\n" +
                "1) Método Iterativo\n"+
                "2) Método Recursivo\n"+
                "3) Salir\n"+
                "Elige la opción";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar(){
        boolean sentinel = true;
        String opcion ="";
        Operaciones op = new Operaciones();
        int n=0;

            do{

                opcion = menu();
                
            
        switch (opcion) {
            case "1":
                n= Integer.parseInt(JOptionPane.showInputDialog("Introcude el número de veces a imprimir"));
                op.setN(n);
                op.imprimir();
            break;

            
            case "2":
                n= Integer.parseInt(JOptionPane.showInputDialog("Introcude el número de veces a imprimir"));
                op.setN(n);
                op.imprimir(op.getN());
            break;

            
            case "3": //Salir
                sentinel = false;
                JOptionPane.showMessageDialog(null, "I'll be back\n");
                JOptionPane.showMessageDialog(null, "tu mama");
            break;

        
            default:
            JOptionPane.showMessageDialog(null, "Valor no valido");
                break;
        }//Cierra el switch

        }while(sentinel); //Cierra el do-while

    } //Cierra el método
    
}


