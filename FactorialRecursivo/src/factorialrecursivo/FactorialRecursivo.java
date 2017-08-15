/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrecursivo;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class FactorialRecursivo {
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
    double n = 5, f;

System.out.print("Introduzca número: ");       
int numero = sc.nextInt();  

try {
n = new Double(args[1]).doubleValue();
}
catch (Exception e){System.out.println("*** Debes digitar el numero n ***");
System.out.println(">java FactorialRecursivo (n)");
}
System.out.println();
FactorialRecursivo Factorial = new FactorialRecursivo();
f = Factorial.factorial(n);
System.out.println("El Factorial del numero " + (int)n + " es " + f);
}

public double factorial(double n) {
    if (n <= 2) {
    return n;
    }
    else {
    return n * factorial(n-1);
    }
   }
}