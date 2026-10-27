/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author laura
 */
public class EVA2_4_QUEUE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      MyQueue queue = new MyQueue();
      queue.push(100);
      queue.push(200);
      queue.push(300);
      queue.push(400);
      queue.push(500);

      System.out.println("Cola:");
      queue.imprimir();
      System.out.println("Primer elemento: " + queue.peek());
      System.out.println("Elemento eliminado: " + queue.pop());
      System.out.println("Lista despuos de eliminar un elemento:");
      queue.imprimir();
   }
   
}
