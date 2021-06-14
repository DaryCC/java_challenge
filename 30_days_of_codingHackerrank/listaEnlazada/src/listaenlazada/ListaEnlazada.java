package listaenlazada;

import java.util.LinkedList;
import java.lang.String;
public class ListaEnlazada {
Nodo head;
int count;

    ListaEnlazada() {
        head=null;
        count=0;
    }

    ListaEnlazada(Nodo Nuevo) {
        head = Nuevo;
        count=1;
    }
//METHODS
    public void add(int dato){
        Nodo temp= new Nodo(dato);
        Nodo current=head;
        while(current.next!=null){
            current=current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    public int get(int index){
        int datoIndex;
        Nodo actualTemp=head;
        if(index<=0){
           return -1; 
        }
        for(int i=1;i<index;i++){
            actualTemp=actualTemp.getNext();
        }
        return actualTemp.getDato();
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
    return count;
    }
    
   //REMOVE
    public void remove(){
        Nodo tempActual=head;
        if(count==1){
            head=null;
        }else{
            while(tempActual.next.next!= null){
                tempActual=tempActual.getNext();
            }
            tempActual.setNext(null);
        }
    }
    public  static void main(String[] args) {
       LinkedList<String> Lista= new LinkedList<String>();
       Lista.add("Lucia");
       Lista.add("Denisse");
       Lista.add("Lucia");
       Lista.add("Nadia");
       Lista.add("Luis");
       System.out.println(Lista);
       Lista.remove();
       System.out.println(Lista);
       Lista.remove("Lucia+");
       System.out.println(Lista);
    }
    
}
