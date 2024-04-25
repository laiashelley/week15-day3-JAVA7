
// 2- ArrayList de números enteros:
// • Pedir cuantos números quiere el usuario entrar
// • Hacer entrada de datos (números) en el bucle
// • Cuando tengas el ArrayList completo, hacer la media de todos los números y dar ese resultado en
// pantalla

import java.util.ArrayList;
import java.util.Scanner;

public class Java7ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        // creo la array de numeros enteros:

        ArrayList <Integer> numerosEnteros = new ArrayList<Integer>();

        // Pedir cuantos números quiere el usuario entrar

        Scanner sc = new Scanner (System.in);

        System.out.println("Cuantos números quieres entrar?");

        int cantidadNumeros = sc.nextInt();

        System.out.println("Ves entrando los números:");

        // Hacer entrada de datos (números) en el bucle

        for (int i = 0; i < cantidadNumeros; i++){
            int numerosUsuario = sc.nextInt();
            numerosEnteros.add(numerosUsuario);
        }

        // Cuando tengas el ArrayList completo, hacer la media de todos los números y dar ese resultado en pantalla

        System.out.println(numerosEnteros);

        // hacer la media:

        int suma = 0;
        for (int numero : numerosEnteros){
            suma += numero;
        }

        double media = (double) suma / numerosEnteros.size();

        System.out.println("La media es:" + media);

        sc.close();

    }
}
