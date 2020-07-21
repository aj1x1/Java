import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestRecursion {


    @Test
    public void junk() {
       String a = "c";

       int x = a.length() -1;
       String sub = a.substring(1);
       System.out.println(sub);
    }

    @Test
    public void TestReverseString() {
        String s = "hello";
        var expected = ("olleh");
        var actual = new recursion().ReverseString(s).toString();
        assertEquals( expected, actual);
    }

    @Test
    public void TestTowerOfHanoi() {
        int n = 3,from = 1,aux = 2,to = 3;
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1,3");
        expected.add("1,2");
        expected.add("3,2");
        expected.add("1,3");
        expected.add("2,1");
        expected.add("2,3");
        expected.add("1,3");
        var actual = recursion.TowerOfHanoi(n, from, aux, to, new ArrayList<String>());
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}