/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

/**
 *
 * @author Dell
 */
public class Lista {
    
    private Nodo primero;
    private Nodo ultimo;
    
    //constructor de la clase
    public Lista(){
        this.primero  = null;
        this.ultimo = null;
    }
    /**
     * Se anexa un nodo al inicio de la lista
     * @param dato
     */
    public void anexarInicioLista (int dato){
      Nodo nuevo;
      nuevo=new Nodo(dato);
      if (primero==null){
          primero=nuevo;
          ultimo=nuevo;
      }
      else{
          nuevo.setEnlace(primero);
          primero=nuevo;
      }
    }
    /**
     * Se anexa un nodo al inicio de la lista
     * @param dato
     */
    public void anexarFinalLista (int dato){
      Nodo nuevo;
      nuevo=new Nodo(dato);
      if (primero==null){
          primero=nuevo;
          ultimo=nuevo;
      }
      else{
          ultimo.setEnlace(nuevo);
          ultimo=nuevo;
          ultimo.setEnlace(null);
      }
    }
    /**
     * Se evalua si lista es vacia
     * @return true si es vacia o false
     */
    public boolean esVacia(){
        return (primero==null);
    }
    /**
     * busca un valor en los nodos de la lista
     * @param dato * @return verdadero o falso
     * @return  */
     public boolean buscarNodo(int dato){
       boolean encontro=false;
       Nodo p=primero;
       while (p.getEnlace()!=null && encontro==false){
         if(p.getDato()==dato)
             encontro=true;
         p=p.getEnlace();
       }
       return encontro;
     }
     public boolean borrarNodoInicio(){
      if(esVacia())
          return false;
      if(primero.getEnlace()==null){
          primero=null;
          ultimo=null;
          return false;
      }
      else{
          Nodo temp=primero;
          primero=primero.getEnlace();
          temp.setEnlace(null);
          return true;
      }
     }
     /**
      * metodo que borra un nodo al final de la lista
      * @return false o true dependiendo si el borro nodo
      */
     public boolean borrarNodoFinal(){
      if (esVacia())
          return false;
      if(primero.getEnlace()==null){
          primero=null;
          ultimo=null;
          return false;
      }
      else{
          Nodo temp=primero;
          Nodo aux=primero;
          while(temp.getEnlace()!=null){
             aux=temp;
             temp=temp.getEnlace();
          }
          ultimo=aux;
          ultimo.setEnlace(null);
          return true;
      }
     }
     /**
      * Metodo que almacena en un string los nodos de
      * la lista
      * a imprimir o el mensaje de lista vacia, si no
      * hay nodos
      * @return String
      */
 public String imprimirLista(){
     String str="\n";
     if(!esVacia()){
    Nodo p=primero;
   while(p.getEnlace()!=null){
        System.out.println(p.getDato()+"");
     p=p.getEnlace();     
 }
 } else {
        str = "Lista Vacia";
}
 return str;
}
}
