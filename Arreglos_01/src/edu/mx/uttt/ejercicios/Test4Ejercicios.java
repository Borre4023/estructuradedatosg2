package edu.mx.uttt.ejercicios;

public class Test4Ejercicios {
        public static void main(String[] args) {


            // EJERCICIO 1 -------------------------------------------------------------------------------

            VectoresEnteros vectores = new VectoresEnteros(3);
    
            // Mis vectores
            vectores.setV1(new int[]{7, 8, 7});
            vectores.setV2(new int[]{78, 42, 6});
    
            // Sumar los vectores
            int[] vectorSuma = vectores.sumarVectores();
    
            // Imprimir
            System.out.print("Vector 1: ");
            vectores.imprimirVector(vectores.getV1());
    
            System.out.print("Vector 2: ");
            vectores.imprimirVector(vectores.getV2());
    
            System.out.print("Suma de los vectores: ");
            vectores.imprimirVector(vectorSuma);
        

          // EJERCICIO 2 ----------------------------------------------------------------------------------

          VectorEscalar escala = new VectorEscalar(3);  //Tamaño del vector

          // Vectores
          escala.setV1(new int[]{1, 2, 3});
          escala.setV2(new int[]{2, 5, 6});
  
          // Calcular el producto escalar de los dos vectores
          int productoEscalar = escala.productoEscalar();
  
          // Imprimir los vectores
          System.out.print("Vector 1: ");
          escala.imprimirVector(escala.getV1());
  
          System.out.print("Vector 2: ");
          escala.imprimirVector(escala.getV2());
  
          // Imprimir el producto escalar
          System.out.println("Producto escalar de los vectores: " + productoEscalar);

          // EJERCICIO 3 --------------------------------------------------------------------------------------

          VectoresInversos inverso1 = new VectoresInversos(5);  //Tamaño del vector

          // Inicializar el vector con valores
          inverso1.setVector(new int[]{1, 2, 3, 4, 5});
  
          // Invertir el vector
          int[] vectorInvertido = inverso1.invertirVector();
  
          // Imprimir el vector original
          System.out.print("Vector original: ");
          inverso1.imprimirVector(inverso1.getVector());
  
          // Imprimir el vector invertido
          System.out.print("Vector invertido: ");
          inverso1.imprimirVector(vectorInvertido);

          //EJERCICIO 4 -------------------------------------------------------------------------------------------

          VectoresMultiEscalar Escal1 = new VectoresMultiEscalar(5);  //Tamaño

          // Vectores
          Escal1.setVector(new int[]{1, 2, 3, 4, 5});

          // Definición de un escalar para la multiplicación
          int escalar = 3;

          // Multiplicar el vector por el escalar
            
          int[] vectorMultiplicado = Escal1.multiplicarPorEscalar(escalar);

           
          // Imprimir el vector original
            
          System.out.print("Vector original: ");
           
          Escal1.imprimirVector(Escal1.getVector());

            
          // Imprimir el vector multiplicado por el escalar
            
          System.out.print("Vector multiplicado por " + escalar + ": ");
            
          Escal1.imprimirVector(vectorMultiplicado);


      }


  }
    

