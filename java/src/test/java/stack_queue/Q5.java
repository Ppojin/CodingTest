package stack_queue;

import org.junit.Assert;
import org.junit.Test;

public class Q5 {
    @Test
    public void case1(){
        Answer5 answer5 = new Answer5();
        int solution = answer5.solution("()(((()())(())()))(())");
        int result = 17;
        Assert.assertEquals(result, solution);
    }
}
