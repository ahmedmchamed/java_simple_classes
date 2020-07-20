public class Printer {
    private int numberOfSheetsLeft;
    private int tonerVolume;

    public Printer(int numberOfSheetsLeft, int tonerVolume) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheetsLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        if (this.numberOfSheetsLeft > 0) {

            this.numberOfSheetsLeft -= numberOfPages * numberOfCopies;

            for (int i = 0; i < numberOfPages; i++) {
                this.tonerVolume = this.tonerVolume - 1;
            }

        }
        else {

            System.out.println("The paper tray beckons thee for more paper.");

        }
    }

}
