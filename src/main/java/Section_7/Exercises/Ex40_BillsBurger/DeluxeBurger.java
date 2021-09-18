package Section_7.Exercises.Ex40_BillsBurger;

public class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super("Deluxe burger", "Angus", 19.10, "For Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add anything to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add anything to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add anything to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot add anything to Deluxe Burger");
    }

}
