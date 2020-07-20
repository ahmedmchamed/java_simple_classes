import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(100, 250);
    }

    @Test
    public void getNumberOfSheets() {
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void getTonerVolume() {
        assertEquals(250, printer.getTonerVolume());
    }

    @Test
    public void printNumberOfSheets() {
        this.printer.print(5, 10);
        assertEquals(245, printer.getTonerVolume());
        assertEquals(50, printer.getNumberOfSheets());
    }

    @Test
    public void printerCantPrintWithoutPaper() {
        Printer printer = new Printer(0, 250);
        printer.print(5, 10);
        assertEquals(0, printer.getNumberOfSheets());
        //toner volume should remain unchanged
        assertEquals(250, printer.getTonerVolume());
    }
}
