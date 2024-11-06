package oops;

public class Motorbike {
    private int speed;
    private String name;

    // Constructor to set the name
    public Motorbike(String name) {
        this.name = name;
    }

    void start() {
        System.out.println(name + " started");
    }

    void setSpeed(int speed) {
        if (speed >= 0 && speed <= 100) {
            this.speed = speed;
            System.out.println(name + " speed set to: " + this.speed + "km/hr");
        } else if (speed < 0) {
            this.speed = 0;
            System.out.println(name + " speed can't be negative. Auto set to 0 km/hr");
        } else {
            this.speed = 100;
            System.out.println(name + " speed can't be more than 100 km/hr. Auto set to 100 km/hr");
        }
    }

    void accelerate() {
        accelerate(10);
    }

    void decelerate() {
        decelerate(10);
    }

    // Customized functions

    void accelerate(int increment) {
        if ((this.speed + increment) < 100) {
            this.speed += increment;
            System.out.println(name + " speed increased to: " + this.speed + "km/hr");
        } else {
            System.out.println(name + " speed limit reached: " + this.speed + "km/hr. Can't be increased by: " + increment + "km/hr");
        }
    }

    void decelerate(int decrement) {
        if ((this.speed - decrement) > 0) {
            this.speed -= decrement;
            System.out.println(name + " speed decreased to: " + this.speed + "km/hr");
        } else {
            System.out.println(name + " speed limit reached: " + this.speed + "km/hr. Can't be decreased by: " + decrement + "km/hr");
        }
    }

    int getSpeed() {
        return this.speed;
    }
}
