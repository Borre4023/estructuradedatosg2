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
                "3) Factorial Iterativo\n"+
                "4) Salir\n"+
                "Elige la opción";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar(){
        boolean sentinel = true;
        String opcion ="";
        Operaciones op = new Operaciones();
        Factorial f = null;
        int n=0;
        long r= 0;

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

            case "3":
                
                opcion = JOptionPane.showInputDialog(menus.menuFactorial());
                f = new Factorial();
                n = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el Valor de Factorial a calcular"));
                f.setN(n);
                r = f.factorialI(opcion);
                JOptionPane.showInputDialog(null,"F( "+f.getN()+" )"+r);
               

            break;

            case "4":
            f = new Factorial();
                n = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el Valor de Factorial a calcular"));
                f.setN(n);

            //f.(f.getN());
            JOptionPane.showMessageDialog(null, "f( "+f.getN()+" )");

            break;

            
            case "5": //Salir
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

//3CiCLOS


