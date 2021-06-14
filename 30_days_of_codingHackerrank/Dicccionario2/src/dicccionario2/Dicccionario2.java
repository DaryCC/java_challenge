/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicccionario2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author darks
 */
public class Dicccionario2 {

   
    public static void main(String[] args) {
        //System.out.println("hola");
        // English to Spanish
        Map<String,String> EngSpanDictionary = new HashMap<String,String >();
        //putting things inside our dictionary
        EngSpanDictionary.put("Monday", "Lunes");
        EngSpanDictionary.put("Tuesday", "Martes");
        EngSpanDictionary.put("Wednesday", "Miercoles");
        EngSpanDictionary.put("Thursday", "Jueves");
        EngSpanDictionary.put("Friday", "Viernes");
        EngSpanDictionary.put("Saturday", "Sabado");
        EngSpanDictionary.put("Sunday", "Domingo");
        //Retrieve things from 
        
        System.out.println(EngSpanDictionary.get("Monday"));
        System.out.println(EngSpanDictionary.get("Tuesday"));
        System.out.println(EngSpanDictionary.get("Wednesday"));
        System.out.println(EngSpanDictionary.get("Thursday"));
        System.out.println(EngSpanDictionary.get("Friday"));
        System.out.println(EngSpanDictionary.get("Saturday"));
        System.out.println(EngSpanDictionary.get("Sunday"));
        //print out all keys
        System.out.println(EngSpanDictionary.keySet());
         //print out all keys
        System.out.println(EngSpanDictionary.values());
        //size
        System.out.println("size: "+EngSpanDictionary.size());
        System.out.println();
        System.out.println();
        //shopping list
        Map<String,Boolean> Lista= new HashMap<String,Boolean>();
        Lista.put("Pan",true);
        Lista.put("Queso", Boolean.FALSE);
        Lista.put("Chele", Boolean.TRUE);
        Lista.put("Nadia", false);
        //Key-Value
        System.out.println(Lista.toString());
        //clear out dictionary
        Lista.clear();
        System.out.println(Lista.toString());
        System.out.println("La lista está vacía?? "+ Lista.isEmpty());
        System.out.println("Agrega a la lista");
        Lista.put("Nadia", Boolean.TRUE);
        Lista.put("Chele", Boolean.TRUE);
        System.out.println(Lista.toString());
        System.out.println("Remove Chele");
        //remove key-value
        Lista.remove("Chele");
        System.out.println(Lista.toString());
        //replace
        System.out.println("Reemplazar value Nadia");
        Lista.replace("Nadia", Boolean.FALSE);
        System.out.println(Lista.toString());
        
                
        
    }
    
}
