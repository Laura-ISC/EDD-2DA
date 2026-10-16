/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author laura
 */
public class EVA2_2_LISTA_SIMPLE {

   public static void main(String[] args) {
      ListaSimple lista = new ListaSimple();
      /*int [] arreglo = new int[1000000];
      long ini, fin, tiempo;
      ini = System.nanoTime(); //TOMAMOS LA "HORA" ANTES DE EMPEZAR
      for (int i = 0; i < arreglo.length; i++) {
         arreglo[i] = (int) (Math.random() * 100);
      }
      fin = System.nanoTime(); //TOMAMOS LA "HORA" DESPUES DE REALIAR EL PROCESO
      tiempo = fin - ini;
      System.out.println("Tiempo arreglo = " + tiempo);
      
       ini = System.nanoTime(); //TOMAMOS LA "HORA" ANTES DE EMPEZAR
      for (int i = 0; i < 1000000; i++) {
         lista.agregar((int) (Math.random() * 100));
      }
      fin = System.nanoTime(); //TOMAMOS LA "HORA" DESPUES DE REALIAR EL PROCESO
      tiempo = fin - ini;
      System.out.println("Tiempo arreglo = " + tiempo);*/
      System.out.println("Tamaño de la lista: " + lista.longitud());
      lista.agregar(100);
      lista.agregar(200);
      lista.agregar(300);
      lista.agregar(400);
      lista.agregar(500);
      lista.imprimir();
      //System.out.println("Tamaño de la lista: " + lista.longitud());
      /*lista.vaciarLista();
      lista.imprimir();*/
      System.out.println("Tamaño de la lista: " + lista.longitud());
      System.out.println("Valor de la posición 4: " + lista.valorEn(4));
      System.out.println("Valor 100 de la posición: " + lista.encontrar(100));
      System.out.println("Valor 300 de la posición: " + lista.encontrar(300));
      System.out.println("Valor 500 de la posición: " + lista.encontrar(500));
      //System.out.println("Valor 700 de la posición: " + lista.encontrar(700));
      /*lista.imprimir();
      lista.insertarEn(9999, 3);
      lista.imprimir();
      System.out.println("Borrar posicion 0: ");
      //lista.borrarEn(0);
      lista.imprimir();
      System.out.println("Borrar posicion 3: ");
      //lista.borrarEn(3);
      lista.imprimir();*/
      lista.insertarEn(999, 1);
      lista.imprimir();
      lista.borrarEn(1);
      lista.imprimir();
      lista.imprimirInverso();
      
   }
   
}
