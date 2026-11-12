/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author laura
 */
public class Nodo {
   //DOS ATRIBUTOS
   private int valor;
   private Nodo derecha;
   private Nodo izquierda;
   //CONSTRUCTORES:
   
   public Nodo(){
      derecha = null; //ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
      izquierda = null;
   }
   
   public Nodo(int valor){//poner el valor a guardar, al momento de crear el nodo
      this.valor = valor;
      derecha = null;
      izquierda = null;
   }

   public int getValor() {
      return valor;
   }

   public void setValor(int valor) {
      this.valor = valor;
   }

   public Nodo getDerecha() {
      return derecha;
   }

   public void setDerecha(Nodo derecha) {
      this.derecha = derecha;
   }

   public Nodo getIzquierda() {
      return izquierda;
   }

   public void setIzquierda(Nodo izquierda) {
      this.izquierda = izquierda;
   }
   
   
}
