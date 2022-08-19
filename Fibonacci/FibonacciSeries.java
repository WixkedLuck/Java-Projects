/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;
import java.util.Scanner;
/**
 *
 * @author garde
 */
public class FibonacciSeries {
 static int c=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter an index for the fibonacci: ");
     int index=input.nextInt();
     System.out.println("Fibonacci number at index "+index+" is "+fib(index));
     System.out.println("The number of times the method is invoked: "+c);
     
    }
    public static long fib(long index){
    c++;
    if(index==0)return 0;
    else if(index==1)return 1;
    else return fib(index-1)+fib(index-2);
    }
}
