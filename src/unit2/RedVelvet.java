package unit2;

public class RedVelvet extends Cupcake {

    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }

    @Override
    public String toString() {
        return "Red Velvet\t\tPrice: " + this.getPrice() + "\n";
    }
}
