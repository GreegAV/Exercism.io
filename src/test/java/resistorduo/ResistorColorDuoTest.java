package resistorduo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class ResistorColorDuoTest {
    private ResistorColorDuo resistorColorDuo;

    @Before
    void setup() {
        resistorColorDuo = new ResistorColorDuo();
    }

    @Test
    void testBrownAndBlack() {
        String[] input = {"brown", "black"};
        int expected = 10;
        int actual = resistorColorDuo.value(input);

        assertEquals(expected, actual);
    }

    //    @Ignore("Remove to run test")
    @Test
    void testBlueAndGrey() {
        String[] input = {"blue", "grey"};
        int expected = 68;
        int actual = resistorColorDuo.value(input);

        assertEquals(expected, actual);
    }

    //    @Ignore("Remove to run test")
    @Test
    void testYellowAndViolet() {
        String[] input = {"yellow", "violet"};
        int expected = 47;
        int actual = resistorColorDuo.value(input);

        assertEquals(expected, actual);
    }

    //    @Ignore("Remove to run test")
    @Test
    void testOrangeAndOrange() {
        String[] input = {"orange", "orange"};
        int expected = 33;
        int actual = resistorColorDuo.value(input);

        assertEquals(expected, actual);
    }

    //    @Ignore("Remove to run test")
    @Test
    void testIgnoreAdditionalColors() {
        String[] input = {"green", "brown", "orange"};
        int expected = 51;
        int actual = resistorColorDuo.value(input);

        assertEquals(expected, actual);
    }
}
