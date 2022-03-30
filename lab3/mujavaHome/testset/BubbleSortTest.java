import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

public class BubbleSortTest {
    private int[] input;
    private int[] expected;

    @Test
    public void bubbleSort1() {
        input = new int[]{1}; expected = new int[]{1};
        assertArrayEquals(BubbleSort.BubbleSort(input), expected);
    }

    @Test
    public void bubbleSort2() {
        input = new int[]{1, 3, 2}; expected = new int[]{1, 2, 3};
        assertArrayEquals(BubbleSort.BubbleSort(input), expected);
    }

    @Test
    public void bubbleSort3() {
        input = new int[]{1, 2, 3, 4, 5}; expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(BubbleSort.BubbleSort(input), expected);
    }

    @Test
    public void bubbleSort4() {
        input = new int[]{5, 4, 3, 2, 1}; expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(BubbleSort.BubbleSort(input), expected);
    }

    @Test
    public void bubbleSort5() {
        input = new int[]{2, 5, 2, 4, 3}; expected = new int[]{2, 2, 3, 4, 5};
        assertArrayEquals(BubbleSort.BubbleSort(input), expected);
    }
}