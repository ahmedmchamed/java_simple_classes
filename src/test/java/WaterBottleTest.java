import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void readVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void volumeReducesBySetAmountForEachDrink() {
        assertEquals(90, waterBottle.drink());
        assertEquals(80, waterBottle.drink());
        assertEquals(70, waterBottle.drink());
    }
}
