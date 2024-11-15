package oops_abstract;

public abstract class Recipe {
    public abstract void getReady();
    public abstract void doTheDish();
    public abstract void cleanup();
    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }
}
