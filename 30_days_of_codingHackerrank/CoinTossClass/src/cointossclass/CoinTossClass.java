
package cointossclass;



import java.util.Random;

public class CoinTossClass {
    
    public String toss(){
      Random rand = new Random();
      int toss = Math.abs(rand.nextInt())%2;
      if(toss==0){
          return "Aguila";
      }
      else
          return "Sol";
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CoinTossClass games = new CoinTossClass();
        System.out.println(games.toss());
        System.out.println(games.toss());
        System.out.println(games.toss());
        System.out.println(games.toss());
        
        
        
    }
    
}
