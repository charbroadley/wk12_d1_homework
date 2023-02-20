import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTests {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }
//    @Test
//    public void hasVolume(){
//        boolean result = volume();
//        assertEquals(true, result);
//    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterBottle.volume);
    }
    @Test
    public void canDrink(){
        int result = waterBottle.drink();
        assertEquals(90, result);
    }
    @Test
    public void canEmptyBottle(){
        int result = waterBottle.empty();
        assertEquals(0, result);
    }
    @Test
    public void canFillBottle(){
        int result = waterBottle.fillBottle();
        assertEquals(100, result);
    }


}
