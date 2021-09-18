package Section_7.Exercises.Ex38_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(0, true);
        System.out.println(printer.addToner(100));
        System.out.println("initial page count = " + + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
