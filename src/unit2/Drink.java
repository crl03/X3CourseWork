package unit2;

public class Drink {
    private double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type(){
        System.out.println("Plain bottle of water.");
    }

    @Override
    public String toString() {
        return "Bottled Water\tPrice: " + this.getPrice() + "\n";
    }
}
