package powerpackage;

import org.junit.Test;

public class powerTest {
    @Test
    public void oneRaisedToOne() {
        assert powerFinder.powerOf(1,1) == 1;
    }

    @Test
    public void twoRaisedToOne() {
        assert powerFinder.powerOf(2,1) == 2;
    }

    @Test
    public void twoPowerTwo() {
        assert powerFinder.powerOf(2, 2) == 4;
    }

    @Test
    public void powerOfTwoAndThree() {
        assert powerFinder.powerOf(3, 2) == 3*3;
    }
}
