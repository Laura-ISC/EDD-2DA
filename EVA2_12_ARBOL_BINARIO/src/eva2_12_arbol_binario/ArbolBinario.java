/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author laura
 */
public class ArbolBinario {
   private Nodo root;
   
   public ArbolBinario(){
      root = null;
   }
   
   public void agregar(int valor){
      //ESTÁ VACÍO EL ÁRBOL
      if(root == null){//arbol vacio
          root = new Nodo(valor);//inserto el valor
      }else{
         agregarRecu(root, valor);
         
      }
   }
   
   //METODO RECURSIVO PARA AGREGAR UN NODO
   private void agregarRecu(Nodo actual, int valor){
      if(valor > actual.getValor()){//A LA DERECHA
           if(actual.getDerecha() != null){ //ocupado
              agregarRecu(actual.getDerecha(), valor);
           }else{//disponible
              actual.setDerecha(new Nodo (valor));
           }
      }else if(valor < actual.getValor()){//A LA IZQUIERDA
         if(actual.getIzquierda() != null){ //ocupado
              agregarRecu(actual.getIzquierda(), valor);
           }else{//disponible
              actual.setIzquierda(new Nodo (valor));
           }
         
      }//ELSE ---> EL VALOR ESTA REPETIDO
   }
   
   public void preOrder(){
      preOrderRecu(root);
      System.out.println("");
   }
   
   public void preOrderRecu(Nodo actual){
      if (actual != null){
         System.out.print(actual.getValor() + " - ");
         preOrderRecu(actual.getIzquierda()); //LEER EL LADO IZQUIERDO
         preOrderRecu(actual.getDerecha()); //LEER EL LADO DERECHO
      
      }
   }
   
   //menor a mayor
   public void inOrder(){
      inOrderRecu(root);
      System.out.println("");
   }
   
    public void inOrderRecu(Nodo actual){
      if(actual.getIzquierda() != null) {
            inOrderRecu(actual.getIzquierda());
        }
        System.out.println("[" + actual.getValor() + "]");
        if(actual.getDerecha() != null) {
            inOrderRecu(actual.getDerecha());
      }
   }
    //recorrido del grafo, 2, 11, 10, 17, 20, 18, 13
    public void postOrder(){
      postOrderRecu(root);
       System.out.println("");
   }
   
    public void postOrderRecu(Nodo actual){
      if(actual.getIzquierda() != null) {
            postOrderRecu(actual.getIzquierda());
        }
        if(actual.getDerecha() != null) {
            postOrderRecu(actual.getDerecha());
        }
        System.out.println("[" + actual.getValor() + "]");
   }
}
