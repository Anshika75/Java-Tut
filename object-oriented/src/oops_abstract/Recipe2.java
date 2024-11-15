package oops_abstract;

public class Recipe2 extends Recipe {
    public void getReady() {
        System.out.println("Turn on the microwave.");
        System.out.println("Get the ingredients ready for microwave.");
    }

    public void doTheDish() {
        System.out.println("Bake the dish.");
    }

    public void cleanup() {
        System.out.println("Clean up the utensils.");
        System.out.println("Turn of the microwave.");
    }

}
