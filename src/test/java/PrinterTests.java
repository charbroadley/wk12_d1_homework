import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(52, 10);
    }

    @Test
    public void canPrint(){
        int result = printer.print(4);
        assertEquals(48, result);
    }
    @Test
    public void canReduceToner(){
        printer.print(4);
        assertEquals(6, printer.tonerVolume);
    }
}
