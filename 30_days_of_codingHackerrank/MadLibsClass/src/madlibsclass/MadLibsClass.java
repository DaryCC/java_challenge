/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibsclass;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author darks
 */
public class MadLibsClass {
   Scanner scanner= new Scanner(System.in);
   String story;
   String name;
   String adjective1;
   String adjective2;
   String noun1;
   String noun2;
   String noun3;
   String randomNums;
   String adverb;
   Random rand = new Random();
   //GET DATA FROM PLAYER
   public void enterName(){
       System.out.println("Nombre:");
       setName(scanner.nextLine());
   }
   public void enterAdjective1(){
       System.out.println("Adjetivo1");
       setName(scanner.nextLine());
   }
   public void enterAdjective2(){
       System.out.println("Adjetivo2");
       setName(scanner.nextLine());
   }
   public void enterNoun1(){
       System.out.println("pronombre1");
       setName(scanner.nextLine());
   }
   public void enterNoun2(){
       System.out.println("pronombre2");
       setName(scanner.nextLine());
   }
   public void enterNoun3(){
       System.out.println("pronombre3");
       setName(scanner.nextLine());
   }
    public void enterAdverb(){
        System.out.println("adverbio");
       setName(scanner.nextLine());
   }
   //getters & //setters
   
    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public String getRandomNums() {
        return randomNums;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt())%100;
        int index=0;
        int [] numberHolder= new int[3];
        while(index < numberHolder.length){
            numberHolder[index]=num+index;
            index++;
        }
       randomNums= " Not "+numberHolder[0]+" Not "+numberHolder[1]+" Not "+numberHolder[2];
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand() {
        this.rand = new Random();
    }
 
   ///INSTRUCTIONS
    public void printInstructions(){
        System.out.println("Bienvenido al juego MadLibs"+
                "haremos una historia empezando por el nombre");
    }
   public void putTogetherTheStory(){
       String story= "EL niño"+getName()+"robó"+noun1+"pendejos"+noun2+" "+noun2+"" +
               noun3+ " +"+ getAdjective1()+" "+getAdjective2()+" "+adverb+ "más"+randomNums+"." ;
       setStory(story);
       
   }
    public static void main(String[] args) {
        // TODO code application logic here
        MadLibsClass nuevo = new MadLibsClass();
        nuevo.printInstructions();
        nuevo.play();
        
    }
    public void play(){
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        setRandomNums();
        enterAdjective1();
        enterAdjective2();
        enterAdverb();
        putTogetherTheStory();
        System.out.println(getStory());
        
    }
}
