/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carclass;


public class CarClass {
    
    int maxspeed=100;
    int minspeed=0;
    int maxNumberOfPeopleInCar = 6;
    double weight=4090;
    
    boolean isTheCarOn= false;
    char condition= 'A';
    String nameOfCar="Lucy";
    
    double maxFuel=16;
    double currentFuel = 8;
    double mpg= 26.5;
    
    int numberOfPeopleInCar=1;
    
    public void  Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxspeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        
    }
    
    //GETTERS AND SETTERS
    public int getMaxSpeed(){
        return this.maxspeed;
    }
    public void setMaxSpeed(int newMaxSpeed){
        this.maxspeed= newMaxSpeed;
    }
    public int getMinSpeed(){
        return this.minspeed;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean isTheCarOn(){
        return this.isTheCarOn;
    }
   
   
   
    public void turnTheCarOn(){
        if(!isTheCarOn){
            isTheCarOn= true;
            System.out.println("The car is On ");
        }
        else{
             System.out.println("The car is already On ");
        }
                
    }
    
    public void printVariables(){
        System.out.println("This is the MaxSpeed "+maxspeed);
        System.out.println(minspeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed()+10);
    }
    public void upgradeMinSpeed(){
        minspeed = maxspeed;
        maxspeed++;
    }
     public void getIn(){
         if(numberOfPeopleInCar < maxNumberOfPeopleInCar){
             numberOfPeopleInCar++;
             System.out.println("Someone got in");
         }
         else{
             System.out.println("The car is full!"+ numberOfPeopleInCar+"= "+maxNumberOfPeopleInCar);
         }
        
    }
     public void getOut(){
         if(numberOfPeopleInCar <0){
             numberOfPeopleInCar--;
         }
         else{
             System.out.println("No one is the car");
         }
        
    }
     public double howManyMilesTillOutOfGas(){
         return currentFuel*mpg;
     }
      public double maxMilesPerFillUp(){
         return maxFuel*mpg;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        CarClass TommyCar = new CarClass();
        TommyCar.turnTheCarOn();
        TommyCar.getOut();
        TommyCar.getOut();
        TommyCar.getIn();
        TommyCar.getIn();
        TommyCar.getIn();
        TommyCar.getIn();
        TommyCar.getIn();
        TommyCar.getIn();
        TommyCar.getIn();
        
    }
}
