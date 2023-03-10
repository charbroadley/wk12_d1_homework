import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

//    @Test
//    public void canPrint(){
//        int result = printer.print(4);
//        assertEquals(48, result);
//    }
//    @Test
//    public void canReduceToner(){
//        printer.print(4);
//        assertEquals(6, printer.tonerVolume);
//    }
    @Test
    public void shouldNotPrintIfNotEnoughPaper() {
        printer.print(100, 5);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void shouldReduceTonerVolumeWhenPrinting() {
        printer.print(5, 2);
        assertEquals(90, printer.getToner());
    }
}
