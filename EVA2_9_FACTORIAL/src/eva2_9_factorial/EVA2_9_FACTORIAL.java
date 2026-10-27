/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_factorial;

/**
 *
 * @author laura
 */
public class EVA2_9_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
       System.out.println("Factorial de 5 = " + factorialCiclo(5));
       System.out.println("Factorial (recu) de 5 = " + factorialRecu(5));
   }
   public static int factorialCiclo(int valor){
      int resu = 1;
      for (int i = 1; i <= valor; i++) {
         resu *= i; 
      }
      return resu;
   }
   
   public static int factorialRecu(int valor){
      if(valor == 0)
         return 1;
      else
         return valor * factorialRecu(valor - 1);
   }
}
