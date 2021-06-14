/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author darks
 */
public class Nodo {
    int dato;
    Nodo next;
    //metodos:
    //constructores
    Nodo(int nuevo){
    dato=nuevo;
    next=null;
    }
    Nodo(int nuevo,Nodo actual){
    dato=nuevo;
    next=actual;
    }
//setters and getters
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
            
}
