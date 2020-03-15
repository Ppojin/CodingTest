package stack_queue;

import org.junit.Assert;
import org.junit.Test;

public class Q2 {
    @Test
    public void case1(){
        int bridge_length = 2;
        int max_weight = 10;
        int[] trucks = {7,4,5,6};

        int correctAnswer = 8;

        Answer2 answer2 = new Answer2();
        int solutionAnswer = answer2.solution(bridge_length, max_weight, trucks);
        System.out.println("================================================");
        System.out.println(correctAnswer);
        System.out.println(solutionAnswer);
        System.out.println("================================================");
        Assert.assertEquals(correctAnswer, solutionAnswer);
    }

    @Test
    public void case2(){
        int bridge_length = 100;
        int max_weight = 100;
        int[] trucks = {10};

        int correctAnswer = 101;

        Answer2 answer2 = new Answer2();
        int solutionAnswer = answer2.solution(bridge_length, max_weight, trucks);
        System.out.println("================================================");
        System.out.println(correctAnswer);
        System.out.println(solutionAnswer);
        System.out.println("================================================");
        Assert.assertEquals(correctAnswer, solutionAnswer);
    }

    @Test
    public void case3(){
        int bridge_length = 100;
        int max_weight = 100;
        int[] trucks = {10,10,10,10,10,10,10,10,10,10};

        int correctAnswer = 110;

        Answer2 answer2 = new Answer2();
        int solutionAnswer = answer2.solution(bridge_length, max_weight, trucks);
        System.out.println("================================================");
        System.out.println(correctAnswer);
        System.out.println(solutionAnswer);
        System.out.println("================================================");
        Assert.assertEquals(correctAnswer, solutionAnswer);
    }

    @Test
    public void case4(){
        int bridge_length = 100;
        int max_weight = 100;
        int[] trucks = {10,10,10,10,10,10,10,10,10,10,10};

        int correctAnswer = 120;

        Answer2 answer2 = new Answer2();
        int solutionAnswer = answer2.solution(bridge_length, max_weight, trucks);
        System.out.println("================================================");
        System.out.println(correctAnswer);
        System.out.println(solutionAnswer);
        System.out.println("================================================");
        Assert.assertEquals(correctAnswer, solutionAnswer);
    }

    @Test
    public void case5(){
        int bridge_length = 100;
        int max_weight = 100;
        int[] trucks = {10,10,10,10,10,10,10,10,10,10,10,10};

        int correctAnswer = 121;

        Answer2 answer2 = new Answer2();
        int solutionAnswer = answer2.solution(bridge_length, max_weight, trucks);
        System.out.println("================================================");
        System.out.println(correctAnswer);
        System.out.println(solutionAnswer);
        System.out.println("================================================");
        Assert.assertEquals(correctAnswer, solutionAnswer);
    }
}
