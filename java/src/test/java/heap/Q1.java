package heap;

import org.junit.Assert;
import org.junit.Test;

public class Q1 {
    @Test
    public void case1(){
        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int k = 7;
        int expect = 2;
        Answer1 answer1 = new Answer1();
        int actual = answer1.solution(scoville, k);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void case3(){
        int[] scoville = new int[]{2, 1, 3, 10, 12, 9};
        int k = 7;
        int expect = 2;
        Answer1 answer1 = new Answer1();
        int actual = answer1.solution(scoville, k);
        Assert.assertEquals(expect, actual);
    }
}
