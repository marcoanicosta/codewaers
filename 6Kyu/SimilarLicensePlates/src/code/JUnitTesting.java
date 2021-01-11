package code;

import org.junit.Test;
import static org.junit.Assert.*;
public class JUnitTesting {
    @Test
    public void shouldHandleTheExamples() {
        boolean expected0 = false;
        boolean actual0 = SimilarLicensePlates.similarLicensePlates("ABC","DEF");
        assertEquals(expected0, actual0);
        boolean expected1 = true;
        boolean actual1 = SimilarLicensePlates.similarLicensePlates("AAA","A A A");
        assertEquals(expected1, actual1);
        boolean expected2 = true;
        boolean actual2 = SimilarLicensePlates.similarLicensePlates("BOX","B0X");
        assertEquals(expected2, actual2);
        boolean expected3 = true;
        boolean actual3 = SimilarLicensePlates.similarLicensePlates("BIZ","812");
        assertEquals(expected3, actual3);
    }
}