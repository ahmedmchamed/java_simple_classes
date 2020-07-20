public class Printer {
    private int numberOfSheetsLeft;

    public void Printer(int numberOfSheetsLeft) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheetsLeft;
    }

    public void print(int numberOfSheets, int numberOfCopies) {
        if (this.numberOfSheetsLeft > 0) {
            this.numberOfSheetsLeft -= numberOfSheets * numberOfCopies;
        }
        else {
            System.out.println("The paper tray beckons you for more paper.");
        }
    }

}
