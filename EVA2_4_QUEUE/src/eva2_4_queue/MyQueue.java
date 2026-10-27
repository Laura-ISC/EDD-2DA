/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author laura
 */
public class MyQueue {
   private Nodo inicio;
   private Nodo fin;
   private int tama;
   
   public MyQueue(){
      inicio = null;
      fin = null;
      tama= 0;
   }
   
   public void imprimir(){
      Nodo temp = inicio;
      while(temp != null){
         System.out.print("[" + temp.getValor() + "]");
         temp = temp.getSiguiente();
      }
      System.out.println("");
   }   
   
   public void imprimirInv(){
      int tama = longitud();
      for (int i = tama; i >= 0; i--) {
         //System.out.println("[" + valorEn +"]");
      }
      System.out.println("");
   }
   
   public int longitud(){
      return tama;
   }
   
   public boolean listaVacia(){
      if(inicio == null){//lista vacía? verdadero
         return true;
      }else{//LISTA CON NODOS
         return false;
      }
   }
   
   //O(1)
   public void vaciarLista(){
      inicio = null;
   }
   
   public void agregar(int valor){
       Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
      if(inicio == null){//lista vacía? verdadero
         inicio = nuevo;//nuevo es el primer nodo de la lista
         fin = nuevo;
      }else{//Lista con nodos
         fin.setSiguiente(nuevo);
         //conectar previo
         nuevo.setPrevio(fin);
         fin = nuevo;
      }
      this.tama++;
   }
   
   //O(N)
    public void insertarEn(int valor, int posicion) {
        if(posicion < 0 || posicion > longitud()) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0) { //INSERTAR AL INICIO
                nuevo.setSiguiente(inicio);
                if (inicio != null){
                   inicio.setPrevio(nuevo);
                }
                inicio = nuevo;
                if(fin == null) { //LISTA VACIA
                    fin = nuevo;
                }
                this.tama++;
                
            } else if(posicion == longitud()) { //INSERTAR AL FINAL
                fin.setSiguiente(nuevo);
                fin = nuevo;
            } else{ //INSERTAR EN EL MEDIO
                Nodo temp = inicio;
                for(int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
    }
    
    //O(N)
    public void borrarEn(int posicion){
    if (posicion < 0 || posicion >= longitud()) {
        throw new RuntimeException("Posición no válida");
    } else {
        if (posicion == 0) {
            inicio = inicio.getSiguiente();
            if (inicio == null) { // Si la lista quedó vacía
                fin = null;
            }
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            if (temp.getSiguiente() == null) {
                fin = temp;
            }
        }
        
    }
    }
    
    public int valorEn(int posicion){
      //excepción
      //VALIDAR posición
      int tama = longitud();
      if(posicion >= 0 && posicion < tama){//POSICIÓN VÁLIDA
         //que posiciones son válidas? de 0 (cero) a N -1 (N es la cantidad de nodos)
         Nodo temp = inicio;
         for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
         }
         return temp.getValor();
      }else{//POSICIÓN NO VÁLIDA
         throw new RuntimeException("La posición " +  posicion + "no es válida");
      }
   }
    
    //QUEUE --> FIFO (PRIMERO EN LLEGAR - PRIMERO EN SALIR):
    //AGREGA UN VALOR AL FINAL DE LA LISTA
    public void push (int valor){
       agregar(valor);
    }
    //LEE EL VALOR DIRECTAMENTE ACCESIBLE, SIN BORRARLO
    public int peek(){
       if (listaVacia()) {
           throw new IllegalStateException("La cola está vacía");
        }
       return valorEn(0);
    }
    //LEER EL VALOR DIRECTAMNETE ACCESIBLE, Y DESPUÉS LO BORRA
    public int pop(){
       //TERMINAR 
       if (listaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = valorEn(0);
        borrarEn(0);
        return valor;
    }
}

