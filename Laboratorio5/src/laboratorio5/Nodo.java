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
public class Nodo {
    
    private int dato;
    //auto referencia
    private Nodo enlace;
    /**
     * Constructor Nodo
     * Se inicializan los atributos de la clase
     * por defecto
     */
    public Nodo(){
        this.dato = 0;
        this.enlace = null;
    }
    /**
     * Constructor Nodo
     * Inicializa el atributo dato de la clase.
     * @param dato 
     */
    public Nodo (int dato){
        this.dato = dato;
        this.enlace = null;
    }
    /*
    * Se Obtiene el dato del Nodo
    * @return valor entero correspondiente al
    * dato
    */
    public int getDato(){
        return dato;
    }
    /**
     * Se actualiza el dato del nodo
     * @param dato
     */
    public void setDato(int dato){
        this.dato = dato;
    }
    /**
     * Obtiene el valor de la referencia
     * @return referencia del siguiente nodo
     */
    public Nodo getEnlace(){
        return enlace;
    }
    /** 
     * se actualiza la referencia del nodo
     * @param enlace
     */
    public void setEnlace(Nodo enlace){
      this.enlace = enlace;  
    }
} 
