package hamming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HammingTest {

    @Test
    public void testNoDistanceBetweenEmptyStrands() {
        assertEquals(0, new Hamming("", "").getHammingDistance());
    }

    //    @Ignore("Remove to run test")
    @Test
    public void testNoDistanceBetweenShortIdenticalStrands() {
        assertEquals(0, new Hamming("A", "A").getHammingDistance());
    }

    //    @Ignore("Remove to run test")
    @Test
    public void testCompleteDistanceInSingleLetterDifferentStrands() {
        assertEquals(1, new Hamming("G", "T").getHammingDistance());
    }

    //    @Ignore("Remove to run test")
    @Test
    public void testDistanceInLongIdenticalStrands() {
        assertEquals(0, new Hamming("GGACTGAAATCTG", "GGACTGAAATCTG").getHammingDistance());
    }

    //    @Ignore("Remove to run test")
    @Test
    public void testDistanceInLongDifferentStrands() {
        assertEquals(9, new Hamming("GGACGGATTCTG", "AGGACGGATTCT").getHammingDistance());
    }

}
