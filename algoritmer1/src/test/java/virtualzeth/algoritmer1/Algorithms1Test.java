package virtualzeth.algoritmer1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Algorithms1Test {
    @Test
    public void randomBoyName() {
        Algorithms1 Algo1 = new Algorithms1();
        Algo1.random.setSeed(10);
        assertEquals("Kritte", Algo1.randomBoyName());
    }
}
