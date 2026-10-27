/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_mcd;

/**
 *
 * @author laura
 */
public class EVA2_10_MCD {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //MAXIMO COMUN DIVISOR
      System.out.println("El maximo comun divisor es: " + mcd(42, 18));
   }
   
   public static int mcd(int dividendo, int divisor){
        int resu = dividendo / divisor;
        int residuo = dividendo % divisor;
        System.out.println(residuo);
        if (residuo == 0) {
            return divisor;
        } else{
            return mcd(divisor, residuo);
        }
    }
   
}
