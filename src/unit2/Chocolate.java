package unit2;

public class Chocolate extends Cupcake {
    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, wth chocolate frosting.");
    }

    @Override
    public String toString() {
        return "Chocolate\t\tPrice: " + this.getPrice() + "\n";
    }
}
