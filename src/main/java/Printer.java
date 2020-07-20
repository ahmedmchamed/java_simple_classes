public class Printer {
    private int numberOfSheetsLeft;

    public void Printer(int numberOfSheetsLeft) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheetsLeft;
    }

}
