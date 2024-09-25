package edu.mx.uttt.recursividad;

public class Operaciones {

        private int n;

        public Operaciones(){
            this.n = 1;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = (n>0)?n:1;
        }

        //MËTODO ITERATIVO

        public void imprimir(){
            int i = 1;
            while(i<=n){
                System.out.println("Hola Mundo");
                i++;
            }
            
        }

        //MÉTODO INTERACTIVO 2

        public void imprimir2(){
            int i = 1;
            while (i<=n){
                System.out.println(n);
                i++;
            }
        }

        public void imprimir(int n){
            //CASO BASE

            if(n == 1){
                System.out.println("Hola Mundo");
            }else{
                //CASO GENERAL
                System.out.println("Hola Mundo");
                imprimir(n-1);
            }
        }

        public void imprimir2(int n){
            //CASO BASE 2

            if(n == 1){
                System.out.println(n);
            }else{
                //CASO GENERAL 2
                System.out.println(n);
                imprimir2(n-1);
            }
        }


        


        
}
