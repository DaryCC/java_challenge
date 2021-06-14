
package pruebaarray;
import java.util.Arrays;
//index: 0  1  2  3  4
    //array:[0, 5, 3, 2, 1]   --->5
    //index:     0       1      2
    //index: ["bob", "bobby", "max"]; ---> length 3
public class PruebaArray {
    public static void printArray(int [] array) {
        System.out.print("[");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void printArray(String [] array) {
        System.out.print("[");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        // TODO code application logic here
    int [] Array1;
    int [] Array2 = new  int[4];
    int [] Array3 = {5,2,9,2,3};
    String[] ShoppingList ={"bananas","apples","pears"};
    //index: 0  1  2  3
    //Array:[10,8, 5, 10]--> length 4;
    Array2 [0] = 10;
    Array2 [1 ] = 8;
    Array2 [2 ] = 5;
    Array2 [3 ] = 10;
        String prueba= Arrays.toString(Array2);
        System.out.println(prueba);
        prueba= Arrays.toString(Array3);
        System.out.println(prueba);
        prueba= Arrays.toString(ShoppingList);
        System.out.println(prueba);
        System.out.println();
        System.out.println();
        //para ordenar array
        Arrays.sort(Array2);
        printArray(Array2);
        System.out.println(Arrays.toString(Array2));
        Arrays.sort(Array3);
        printArray(Array3);
        System.out.println(Arrays.toString(Array3));
        
        
        //special loop: foreach para string
        for (String S : ShoppingList) {
            System.out.print(S);
            System.out.print(" ");
        }
        System.out.println(" ");
        
        printArray(ShoppingList);
        System.out.println(Arrays.toString(ShoppingList));
    }
    
}
