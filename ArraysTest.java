import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArraysTest {

    @Test
    public void testComputeSum() {
        int[] numbers = {1, 2, 3, 4, 6}; // Note: The 5 was replaced by 6
        int expectedSum = 16; // The expected sum is 16
        int actualSum = Arrays.computeSum(numbers);
        assertEquals(expectedSum, actualSum);
    }
}
