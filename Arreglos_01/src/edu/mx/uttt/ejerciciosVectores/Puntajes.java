package edu.mx.uttt.ejerciciosVectores;

import java.util.Random;

public class Puntajes {
    private int[] puntajes;
    private int deficientes;
    private int regulares;
    private int buenos;
    private int excelentes;

    public Puntajes(int n) {
        Random rand = new Random();
        puntajes = new int[n];
        for (int i = 0; i < puntajes.length; i++) {
            puntajes[i] = rand.nextInt(21); // Genera puntajes entre 0 y 20
        }
    }

    // Cambiado a String: este método devuelve los puntajes generados como texto
    public String mostrarPuntajes() {
        StringBuilder resultado = new StringBuilder("Puntajes generados:\n");
        for (int puntaje : puntajes) {
            resultado.append(puntaje).append(" ");
        }
        resultado.append("\n");
        return resultado.toString();
    }

    public void categorizarPuntajes() {
        deficientes = 0;
        regulares = 0;
        buenos = 0;
        excelentes = 0;

        for (int puntaje : puntajes) {
            if (puntaje >= 0 && puntaje <= 5) {
                deficientes++;
            } else if (puntaje >= 6 && puntaje <= 10) {
                regulares++;
            } else if (puntaje >= 11 && puntaje <= 15) {
                buenos++;
            } else if (puntaje >= 16 && puntaje <= 20) {
                excelentes++;
            }
        }
    }

    
    public String mostrarCategorias() {
        return "Deficientes (0-5): " + deficientes + "\n"
             + "Regulares (6-10): " + regulares + "\n"
             + "Buenos (11-15): " + buenos + "\n"
             + "Excelentes (16-20): " + excelentes + "\n";
    }
}