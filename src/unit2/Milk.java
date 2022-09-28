package unit2;

public class Milk extends Drink {

    @Override
    public void type() {
        System.out.println("Carton of cold whole milk.");
    }

    @Override
    public String toString() {
        return "Pint of Milk\tPrice: " + this.getPrice() + "\n";
    }
}
