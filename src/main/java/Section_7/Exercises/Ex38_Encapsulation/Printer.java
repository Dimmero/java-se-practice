package Section_7.Exercises.Ex38_Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100){
                return -1;
            }
            return tonerLevel += tonerAmount;
        }
        return  -1;
    }

    public int printPages(int pages) {
        if (duplex){
            isDuplex();
            int pagesToPrint = (int) Math.round((double)pages / 2);
             pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void isDuplex(){
        if (this.duplex){
            System.out.println("Printing in duplex mode");
        } else {
            System.out.println("Printing in simple mode");
        }
    }
}
