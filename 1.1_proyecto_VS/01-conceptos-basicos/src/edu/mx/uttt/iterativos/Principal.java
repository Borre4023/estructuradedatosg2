package edu.mx.uttt.iterativos;
import javax.swing.JOptionPane;
public class Principal {
public static void main(String[] args) {
    double resultado = gestionarOperaciones(menu());

    if(resultado==0.0){
        JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
    }else{
        JOptionPane.showMessageDialog(null, resultado);
    }
}

    public static String menu(){
        String menu = "MENU PRINCIPAL \n"+
                        "1)Serie1\n"+
                        "2)Serie2\n"+
                        "3)Factorial\n"+
                        "4)Potencia\n"+
                        "5)Serie3\n"+
                        "Elige una opcion: ";

        return JOptionPane.showInputDialog(menu);

    }

        public static double gestionarOperaciones(String opcion){
            double resultado = 0.0;
            int valor = 0;
            switch (opcion) {
                case "1":
                Serie serie = new Serie(); 
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de n"));
                    break;
                    
                case "2":
                Serie2 serie2 = new Serie2();
                valor= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor"));
                    break;
                
                case "3":
                
                break;

                case "4":
                
                break;

                case "5":
                
                break;

                case "6":
                
                break;
            
                default:
                System.out.println("No existe la opción");
                    break;
            }

            return resultado;

        }

}
