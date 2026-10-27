/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author laura
 */
public class EVA2_5_STACK {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      MyStack stack = new MyStack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        System.out.println("Pila:");
        stack.imprimir();
        System.out.println("Ultimo elemento: " + stack.peek());
        System.out.println("Elemento eliminado: " + stack.pop());
        System.out.println("Lista despues de eliminar un elemento:");
        stack.imprimir();
   }
   
}
