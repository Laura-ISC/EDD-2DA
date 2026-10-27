/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author laura
 */
public class Nodo {
   //DOS ATRIBUTOS
   private int valor;
   private Nodo siguiente;
   private Nodo previo;
   //CONSTRUCTORES:
   
   public Nodo(){
      siguiente = null; //ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
   }
   
   public Nodo(int valor){//poner el valor a guardar, al momento de crear el nodo
      this.valor = valor;
      siguiente = null;
   }

   public int getValor() {
      return valor;
   }

   public void setValor(int valor) {
      this.valor = valor;
   }

   public Nodo getSiguiente() {
      return siguiente;
   }

   public void setSiguiente(Nodo siguiente) {
      this.siguiente = siguiente;
   }

   public Nodo getPrevio() {
      return previo;
   }

   public void setPrevio(Nodo previo) {
      this.previo = previo;
   }
   
   
}
