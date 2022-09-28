package unit2;

public class Cupcake {
    private double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting.");
    }


    @Override
    public String toString() {
        return "Vanilla Cupcake\tPrice: " + this.getPrice() + "\n";
    }
}
