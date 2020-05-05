package stack_queue;

import org.junit.Assert;
import org.junit.Test;

public class Q4 {
    @Test
    public void case1(){
        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2;
        int correctAnswer = 1;
        Answer4 answer4 = new Answer4();
        int myAnswer = answer4.solution(priorities, location);
        Assert.assertEquals(correctAnswer, myAnswer);
    }

    @Test
    public void case2(){
        int[] priorities = new int[]{1, 1, 9, 1, 1, 1};
        int location = 0;
        int correctAnswer = 5;
        Answer4 answer4 = new Answer4();
        int myAnswer = answer4.solution(priorities, location);
        Assert.assertEquals(correctAnswer, myAnswer);
    }
}
