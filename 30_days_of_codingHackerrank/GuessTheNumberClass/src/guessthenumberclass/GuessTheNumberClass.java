/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumberclass;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author darks
 */
public class GuessTheNumberClass {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumberClass() {
        max=100;
        Random rand = new Random();
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
        
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too bigg");
            } else if (move < theNumber) {
                System.out.println("Your number is to small");
            } else {
                System.out.println("  you got it ese");
                break;
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GuessTheNumberClass NuevoJuego= new GuessTheNumberClass();
        System.out.println("EL número está entre 0 y "+NuevoJuego.max);
        NuevoJuego.play();
    }

}
