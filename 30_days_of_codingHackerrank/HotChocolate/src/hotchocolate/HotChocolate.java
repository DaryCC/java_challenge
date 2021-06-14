package hotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {
    public static final double tooHot=185;
    public static final double tooCold=160;
    
    public static void drinkHotChocolate(double cocoaTem)throws TooCold, TooHot{
        if(cocoaTem>= tooHot){
            throw new TooHot();
        }else if(cocoaTem<= tooCold){
            throw new TooCold();
        }
        
    }
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        double currentTemp = 150;
        boolean wrongTemp = true;
        while (wrongTemp == true) {
            try {
                drinkHotChocolate(currentTemp);
                System.out.println("That was good");
                wrongTemp = false;
            } catch (TooHot e1) {
                System.out.println("TOO HOT");
                currentTemp = currentTemp - 3;
            } catch (TooCold e2) {
                System.out.println("TOO COLD");
                currentTemp = currentTemp + 3;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's done");
    }
}
