/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author laura
 */
public class ListaDoble {
   private Nodo inicio;
   private Nodo fin;
   private int tama;
   
   public ListaDoble(){
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
      Nodo temp = fin;
      while (temp !=  null){
         System.out.print("[" + temp.getValor() + "]");
         temp = temp.getPrevio();
      }
      System.out.println("");
   }
   
   public int longitud(){
      return tama;
   }
   
   public boolean listaVacia(){
         return inicio == null;
   }
   
   //O(1)
   public void vaciarLista(){
      inicio = null;
      fin = null;
      tama = 0;
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
   
   public int valorEn(int posicion) {
        if (posicion < 0 || posicion >= tama) {
            throw new IndexOutOfBoundsException(
                "La posicion " + posicion + " no es valida"
            );
        }

        Nodo temp;

        if (posicion < tama / 2) {
            temp = inicio;

            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
        } else {
            temp = fin;
            for (int i = tama - 1; i > posicion; i--) {
                temp = temp.getPrevio();
            }
        }
        return temp.getValor();
    }

   public int encontrar(int valor) {
        Nodo temp = inicio;
        int pos = 0;

        while (temp != null) {
            if (temp.getValor() == valor) {
                return pos;
            }

            pos++;
            temp = temp.getSiguiente();
        }

        throw new IndexOutOfBoundsException("Valor no encontrado");
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
                } else {
                   fin = nuevo;
                }
                inicio = nuevo;
                     
                
            } else if(posicion == longitud()) { //INSERTAR AL FINAL
               nuevo.setPrevio(fin);
                fin.setSiguiente(nuevo);
                fin = nuevo;
            } else{ //INSERTAR EN EL MEDIO
                Nodo temp = inicio;
                for(int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
               Nodo anterior = temp.getPrevio();
               nuevo.setPrevio(anterior);
               nuevo.setSiguiente(temp);

              anterior.setSiguiente(nuevo);
              temp.setPrevio(nuevo);
            }
            tama++;
    }
    }
    
    //O(N)
    public void borrarEn(int posicion){
       if (posicion < 0 || posicion >= longitud()) {
        throw new RuntimeException("Posición no válida");
    }
    Nodo temp;

        if (posicion < tama / 2) {
            temp = inicio;

            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
        } else {
            temp = fin;

            for (int i = tama - 1; i > posicion; i--) {
                temp = temp.getPrevio();
            }
        }

        if (temp.getPrevio() != null) {
            temp.getPrevio().setSiguiente(temp.getSiguiente());
        } else {
            inicio = temp.getSiguiente();
        }

        if (temp.getSiguiente() != null) {
            temp.getSiguiente().setPrevio(temp.getPrevio());
        } else {
            fin = temp.getPrevio();
        }

        tama--;
    }
}
