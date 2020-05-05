package stack_queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q6 {
    @Test
    public void case1(){
        int[] prices = new int[]{1, 2, 3, 2, 3};
        int[] expected = new int[]{4, 3, 1, 1, 0};
        Answer6 answer6 = new Answer6();
        int[] actual = answer6.solution(prices);

        ArrayList<Integer> expectedList = new ArrayList<>();
        for(int num : expected){
            expectedList.add(num);
        }
        ArrayList<Integer> actualList = new ArrayList<>();
        for(int num : actual){
            actualList.add(num);
        }
        Assert.assertEquals(expectedList, actualList);
    }
}
