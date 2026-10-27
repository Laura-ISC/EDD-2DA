/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_fibonacci;

/**
 *
 * @author laura
 */
public class EVA2_11_FIBONACCI {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      System.out.println("Fibonacci(0) = " + Fibo(0));
   }
   
   public static int Fibo(int posi){
      if(posi > 1)
         return Fibo(posi - 2) + Fibo(posi - 1);
      else
         return 1;
   }
}
