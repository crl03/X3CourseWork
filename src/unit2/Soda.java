package unit2;

public class Soda extends Drink {


    @Override
    public void type() {
        System.out.println("Can of Soda");
    }

    @Override
    public String toString() {
        return "Soda Can\t\tPrice: " + this.getPrice() + "\n";
    }
}
