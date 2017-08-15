/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccirecursivo;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class FibonacciRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite número: ");
        x = sc.nextInt(); 
        
        System.out.println("Result: "+fibonaccirecursivo(x));
    }
    
    
    public static int fibonaccirecursivo(int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            
        }
        
        if (n==0 || n==1) 
        {
            return 1;
        }
        
        else{
            return fibonaccirecursivo(n-1) + fibonaccirecursivo(n-2);
        }
    
    }
    
    
    
    
    
    
}
