/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test public void testRollMethod() {
        int expected = 10;

        // test return arrays are the same in length
        assertEquals("Returned array should be equal to expected", expected, Library.roll(expected).length);
        // test return arrays return different values
        assertNotEquals("Returned array should not be the same", Arrays.toString(Library.roll(expected)), Arrays.toString(Library.roll(expected)));

    }
    @Test public void testDuplicatesMethod() {

        String[]testArrayOne = {"1","2","3", "4", "5"};
        String[]testArrayTwo = {"1","2","3", "3"};

        assertFalse("The arrays should return false", Library.containsDuplicates(testArrayOne));
        assertTrue("The array should return true", Library.containsDuplicates(testArrayTwo));

    }

    @Test public void testAverageOfArray() {

        int[] testArrayOne = {1,2,3,4,5};
        double expected = 15 / 5;

        
        assertEquals(expected, Library.calculateAverageOfArray(testArrayOne), 0);

    }

}


