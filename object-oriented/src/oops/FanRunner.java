package oops;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.456, "Green");
        System.out.println(fan);
        fan.switchOn();
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
        fan.setSpeed((byte) 3);
        System.out.println(fan);
    }
}
