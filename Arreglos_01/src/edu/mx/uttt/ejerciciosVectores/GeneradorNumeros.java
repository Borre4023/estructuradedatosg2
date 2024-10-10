package edu.mx.uttt.ejerciciosVectores;

import java.util.Random;

public class GeneradorNumeros {
    private int totalNumeros;
    private int suma;
    private int numeroMasGrande;
    private int numeroMasPequeno;
    private int[] frecuencias; // para contar las frecuencias de números entre 1 y 30
    private int[] conteo1a10; // para contar los números entre 1 y 10
    private Random random;

    public GeneradorNumeros(int totalNumeros) {
        this.totalNumeros = totalNumeros;
        this.suma = 0;
        this.numeroMasGrande = Integer.MIN_VALUE;
        this.numeroMasPequeno = Integer.MAX_VALUE;
        this.frecuencias = new int[30]; // un número entre 1 y 30
        this.conteo1a10 = new int[10]; // un número entre 1 y 10
        this.random = new Random();
    }

    // Método para generar los números y realizar las operaciones
    public void generarYProcesarNumeros() {
        for (int i = 0; i < totalNumeros; i++) {
            int numero = random.nextInt(30) + 1; // Generar número entre 1 y 30
            System.out.println("Número generado: " + numero);

            // Sumar para la media
            suma += numero;

            // Verificar número más grande
            if (numero > numeroMasGrande) {
                numeroMasGrande = numero;
            }

            // Verificar número más pequeño
            if (numero < numeroMasPequeno) {
                numeroMasPequeno = numero;
            }

            // Actualizar frecuencia del número
            frecuencias[numero - 1]++;

            // Contar números entre 1 y 10
            if (numero >= 1 && numero <= 10) {
                conteo1a10[numero - 1]++;
            }
        }
    }

    // Método para obtener el número más grande
    public int obtenerNumeroMasGrande() {
        return numeroMasGrande;
    }

    // Método para obtener el número más pequeño
    public int obtenerNumeroMasPequeno() {
        return numeroMasPequeno;
    }

    // Método para calcular la media
    public double obtenerMedia() {
        return (double) suma / totalNumeros;
    }

    // Método para calcular la mediana
    public double obtenerMediana() {
        int numeroActual = 0;
        int mediana1 = 0, mediana2 = 0;
        int mitad = totalNumeros / 2;
        for (int i = 0; i < 30; i++) { 
            numeroActual += frecuencias[i];
            if (numeroActual >= mitad && mediana1 == 0) {
                mediana1 = i + 1;
            }
            if (numeroActual >= mitad + 1) {
                mediana2 = i + 1;
                break;
            }
        }
        return totalNumeros % 2 == 0 ? (mediana1 + mediana2) / 2.0 : mediana1;
    }

    // Método para calcular la moda
    public int obtenerModa() {
        int moda = 0;
        int frecuenciaModa = 0;
        for (int i = 0; i < 30; i++) {
            if (frecuencias[i] > frecuenciaModa) {
                frecuenciaModa = frecuencias[i];
                moda = i + 1;
            }
        }
        return moda;
    }

    // Método para obtener la cantidad de números entre 1 y 10 y sus porcentajes
    public String obtenerCantidadYPorcentaje() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("\nCantidad de números del 1 al 10 y sus porcentajes:\n");
        for (int i = 0; i < 10; i++) {
            double porcentaje = (conteo1a10[i] / (double) totalNumeros) * 100;
            resultado.append("Número ").append(i + 1).append(": ").append(conteo1a10[i])
                     .append(" veces, ").append(String.format("%.2f", porcentaje)).append("%\n");
        }
        return resultado.toString();
    }

    // Método para mostrar todos los resultados
    public String mostrarResultados() {
        return "Número más grande: " + obtenerNumeroMasGrande() + "\n"
             + "Número más pequeño: " + obtenerNumeroMasPequeno() + "\n"
             + "Media: " + obtenerMedia() + "\n"
             + "Moda: " + obtenerModa() + "\n"
             + "Mediana: " + obtenerMediana() + "\n"
             + obtenerCantidadYPorcentaje();
    }


}
