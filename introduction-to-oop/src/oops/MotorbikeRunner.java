package oops;

public class MotorbikeRunner {
    public static void main(String[] args) {
        Motorbike honda = new Motorbike("Honda");
        Motorbike ducati = new Motorbike("Ducati");

        honda.start();
        honda.setSpeed(130);
        honda.accelerate();
        honda.decelerate();
        honda.accelerate(50);
        honda.decelerate(50);
        System.out.println("Honda speed: " + honda.getSpeed() + " km/hr");p

        System.out.println();

        ducati.start();
        ducati.setSpeed(0);        
        ducati.accelerate();
        ducati.decelerate();
        ducati.accelerate(50);        
        ducati.decelerate(60);
        System.out.println("Ducati speed: " + ducati.getSpeed() + " km/hr");
    }
}
