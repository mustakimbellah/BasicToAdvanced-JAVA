
package ObjectOrientedProgramming;


public class Bus extends Vehicle{
    
    int maxspeed = 180;
    
    void display(){
    
        System.out.println("Max speed: "+this.maxspeed);
    }
    
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.display();
    }
    
}
