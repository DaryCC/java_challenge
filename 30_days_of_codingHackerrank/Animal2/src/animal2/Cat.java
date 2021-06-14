/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal2;
public class Cat extends Animal2{
    public Cat(int age){
        super(9);
        System.out.println("A cat has been created");
    }
      public void sleep(){
        System.out.println("A cat is sleeping");
    }
    public void eat(){
        System.out.println("A cat eats");
    }
    public void meow(){
        System.out.println("A cat meous!");
    }
    public void prance(){
        System.out.println("A cat is prancing");
    }
    
}
