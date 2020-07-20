public class Printer {
    private int numberOfSheetsLeft;
    private int tonerVolume;

    public void Printer(int numberOfSheetsLeft, int tonerVolume) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheetsLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
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
