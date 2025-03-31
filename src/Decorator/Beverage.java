package Decorator;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public enum Size { TALL, GRANDE, VENTI };

    Size size = Size.TALL;

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return this.size;
    }
}
