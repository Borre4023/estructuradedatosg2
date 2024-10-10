package edu.mx.uttt.ejerciciosVectores;
import javax.swing.JOptionPane;

public class Menu2 {
    public static void main(String[] args) {
        boolean salir = false;
        
        while (!salir) {
            // Mostrar el menú interactivo
            String opcion = JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:\n"
              + "1. Ejercicio 1: Moda, Media, Mediana\n"
              + "2. Ejercicio 2: Puntajes\n"
              + "3. Salir",
                "Menú principal",
                JOptionPane.QUESTION_MESSAGE
            );

            switch (opcion) {
                case "1":
                    ejecutarEjercicio1(); // Reemplaza con la implementación de tu primer ejercicio
                    break;
                case "2":
                    ejecutarEjercicio2(); // Aquí referenciamos el ejercicio de Puntajes
                    break;
                case "3":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo.");
            }
        }
    }

     // Método para ejecutar el Ejercicio 1
     private static void ejecutarEjercicio1() {
        GeneradorNumeros generador = new GeneradorNumeros(30);
        generador.generarYProcesarNumeros();
        JOptionPane.showMessageDialog(null, generador.mostrarResultados(), "Resultados Ejercicio 1", JOptionPane.INFORMATION_MESSAGE);
    }
    private static void ejecutarEjercicio2() {
        // Preguntar al usuario cuántos puntajes desea generar
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puntajes a generar:"));
        
        // Crear una instancia de la clase Puntajes
        Puntajes puntajes = new Puntajes(cantidad);
        
        // Categorizar los puntajes
        puntajes.categorizarPuntajes();
        
        // Mostrar puntajes y categorías en JOptionPane
        String resultados = puntajes.mostrarPuntajes() + puntajes.mostrarCategorias();
        JOptionPane.showMessageDialog(null, resultados, "Resultados Ejercicio 2: Puntajes", JOptionPane.INFORMATION_MESSAGE);
    }

}
