import java.util.Scanner;

public class Main {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int numero;

// System.out.println("Dime un numero para saber si es capicua");
//       numero= sc.nextInt();
        //System.out.println(esPrimo());

        //System.out.println(potencia(2,3));
       int  num =  quitarPorLaDerecha(123456, 3);
        System.out.println(num);
    }
    public static boolean capicua(int numero){
//        boolean capicua = false;
//        int aux,numerofin=0,cifra;
//        aux=numero;
//        while (aux!=0){
//            cifra=aux %10;
//            numerofin=numerofin*10 + cifra;
//            aux=aux/10;
//        }
//        if (numero==numerofin) {capicua=true;
//
//        }
//        return capicua;
        // 12421 -> 1 *10 = 10 + ( 21 / 10 y ser un entero ,1 desaparece y se queda 2)
        int ultimasCifras = ((numero % 10)*10) + ((numero % 100) /10);
        //Sacamos las dos primeras cifras
        int primerasCifras = numero / 1000 ;
        return ultimasCifras == primerasCifras;
    }
       public static boolean esPrimo(){
           int num=0;
        System.out.println("dime un numero");
           num=sc.nextInt();
           if (num==0 || num==1){
               System.out.println("no es primo");
               return false;
           }
           for (int i = 2; i < num/2; i++) {
               if (num%i==0){
                   System.out.println("no es primo");
                   return false;
               }
           }
           System.out.println("es primo");
           return true;

       }

    public static int potencia(double base, double exponente){
//        int resultado = 1;
//        for (int i=0; i < exponente; i++){
//            resultado*=base;
//        }
        return (int)Math.pow(base, exponente);
    }

    public static void contarDigitos(int numero){
//        String num;
//        num=Integer.toString(numero);
//        System.out.println(num.length());

        int contador = 0;
        while (numero >0){
            contador ++;
            numero = numero /10;
            //
        }
        System.out.println(contador);
    }

    public static int quitarPorLaDerecha(int numero, int n){
         int contador = 1;
         while (contador <= n){
             contador ++;
             numero = numero /10;
         }

         return numero;
    }

    public static void quitarPorLaIzquierda( int numero, int n){
        //Pasamos el numero a String
        String literal  = String.valueOf(numero);
        //Con metodos propios de la clase String ->substring
        String numeroCortado = literal.substring(n);
        System.out.println(Integer.parseInt(numeroCortado));
    }

public static void pegaPorDetras(int numero, int extra){
    System.out.println((numero*10) + extra);
}


}