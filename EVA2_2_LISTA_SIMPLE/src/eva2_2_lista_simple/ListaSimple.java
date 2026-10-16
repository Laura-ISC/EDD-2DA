/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author laura
 */
public class ListaSimple {
   private Nodo inicio;
   private Nodo fin;
   private int tama;
   
   public ListaSimple(){
      inicio = null;//al crear la lista, se crea vacia
      fin = null;
   }
   
   //SIEMPRE SE AGREGA AL FINAL DE LA LISTA
   //VERSION 1: O(N) --> SE AGREGA AL FINAL, SE RECORREN TODOS
   //VERSION MEJORADA: 
   //O(N) O(1)
   public void agregar(int valor){
      Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
      if(inicio == null){//lista vacía? verdadero
         inicio = nuevo;//nuevo es el primer nodo de la lista
         fin = nuevo;
      }else{//Lista con nodos
         //movernos al final
         /*Nodo temp = inicio;
         while(temp.getSiguiente() != null){
            temp = temp.getSiguiente();
         }
         temp.setSiguiente(nuevo);//conecto nuevo el final de la lista */
         fin.setSiguiente(nuevo);
         fin = nuevo;
      }
      this.tama++;
   }
   
   //O(N)
   public void imprimir(){
      Nodo temp = inicio;
      while(temp != null){
         System.out.print("[" + temp.getValor() + "]");
         temp = temp.getSiguiente();
      }
      System.out.println("");
   }
   //IMPRIMAN EN ORDEN IVERSO
   //O(N2)
   
   //O(N)
   //QUE AJUSTES HAY QUE HACER PARA QUE SEA O(1)
   public int longitud(){
      return tama;
      /*int cont = 0;
      Nodo temp = inicio;
      while(temp != null){
         cont++;
         temp = temp.getSiguiente();
      }
      return cont;*/
   }
   
   
   //O(1)
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
     
   //VALIDAR: posición tebga un valor válido
   //O(?)
                                     //throws
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
   
   //Regresa la primer aparición del valor en la lista
   //regresa la posición
   //O(N)
   public int encontrar(int valor){
      Nodo temp = inicio;
        int pos = 0;
        while(temp != null) {
            if(temp.getValor() == valor) {
                return pos;
            }
            pos++;
            temp = temp.getSiguiente();
        }
        throw new IndexOutOfBoundsException("Valor no encontrado"); //NO SE ENCONTRO EL VALOR
    }

   //O(N)
    public void insertarEn(int valor, int posicion) {
        if(posicion < 0 || posicion > longitud()) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0) { //INSERTAR AL INICIO
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null) { //LISTA VACIA
                    fin = nuevo;
                }
            } else if(posicion == longitud()) { //INSERTAR AL FINAL
                fin.setSiguiente(nuevo);
                fin = nuevo;
            } else{ //INSERTAR EN EL MEDIO
                Nodo temp = inicio;
                for(int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                //CONECTAR
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
        tama++;
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
        tama--;
    }
    }
    
    public void imprimirInverso(){
       int tama = longitud();
      for (int i = tama -1 ; i >= 0; i--) {
         System.out.print("[" + valorEn(i) +"]");
      }
      System.out.println("");
    }
    
}
