package Tests;

import CodeTasks.ArrayMultipleElementsAlgorithm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayAccuracyTest {

    private static final ArrayMultipleElementsAlgorithm ARRAY_ALGORITHM = new ArrayMultipleElementsAlgorithm();

    @Test
    public void checkArrayIsNotEmpty() {
        Assert.assertNotEquals(ARRAY_ALGORITHM.getDefaultArray().length, 0);
    }

    @Test
    public void checkArrayIsNotTeemingNulls() {
        int counter = 0;
        for (int element : ARRAY_ALGORITHM.getDefaultArray()) {
            if (element == 0) {
                counter++;
            }
        }
        Assert.assertTrue(counter <= 1);
    }
}
