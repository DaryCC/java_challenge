/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal2;
public class Dog extends Animal2 {
    public Dog(int edad){
        super(15);
        System.out.println("A dog has been created.");
    }
      public void sleep(){
        System.out.println("A Dog is sleeping");
    }
     public void eat(){
        System.out.println("A dog eats");
    }
    public void ruff(){
        System.out.println("A dog says roof");
    }
    public void run(){
        System.out.println("A dog is running");
    }
}
