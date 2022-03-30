import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

public class BackPackTest {
    private int m;
    private int n;
    private int[] w;
    private int[] p;
    private int expected;

    @Test
    public void backPack_Solution1() {
        m = 1; n = 2; w = new int[]{1, 2}; p = new int[]{1, 2}; expected = 1;
        assertEquals(BackPack.BackPack_Solution(m, n, w, p)[n][m], expected);
    }

    @Test
    public void backPack_Solution2() {
        m = 5; n = 3; w = new int[]{6, 7, 8}; p = new int[]{4, 5, 6}; expected = 0;
        assertEquals(BackPack.BackPack_Solution(m, n, w, p)[n][m], expected);
    }

    @Test
    public void backPack_Solution3() {
        m = 10; n = 3; w = new int[]{3, 4, 5}; p = new int[]{4, 5, 6}; expected = 11;
        assertEquals(BackPack.BackPack_Solution(m, n, w, p)[n][m], expected);
    }

    @Test
    public void backPack_Solution4() {
        m = 10; n = 3; w = new int[]{2, 4, 4}; p = new int[]{4, 5, 6}; expected = 15;
        assertEquals(BackPack.BackPack_Solution(m, n, w, p)[n][m], expected);
    }

    @Test
    public void backPack_Solution5() {
        m = 10; n = 4; w = new int[]{2, 3, 4, 5}; p = new int[]{4, 5, 6, 5}; expected = 15;
        assertEquals(BackPack.BackPack_Solution(m, n, w, p)[n][m], expected);
    }
}