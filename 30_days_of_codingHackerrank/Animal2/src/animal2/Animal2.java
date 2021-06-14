/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal2;
public abstract class Animal2 {
public int age;
    public Animal2(int age){
        this.age=age;
        System.out.println("An animal has been created!"+age+"years");
    }
    public void sleep(){
        System.out.println("An animal is sleeping");
    }
    public abstract void eat();
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal granja=new Animal(5);
        Dog p = new Dog(5);
        Cat g = new Cat(6);
        p.ruff();
        g.meow();
        p.run();
        g.prance();
        p.eat();
        g.eat();
        System.out.println(p.age);
        System.out.println(g.age);
        //CASTING
        Object perro=new Dog(9);
        Dog realdog=(Dog)perro;
        realdog.sleep();
        
        Object Stringi= "hola";
        String realS =(String)Stringi ;
        System.out.println(realS);
        
        Dog perrito = new Dog(45);
        if(perrito instanceof Animal2){
            Animal2 prueba= (Animal2)perrito;
            prueba.sleep();
            
        }
        
    }
}
