package stack_queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    @Test
    public void case1(){
        int[] progresses = new int[]{93,30,55};
        int[] speeds = new int[]{1,30,5};

        int[] correctAnswer = new int[]{2,1};
        int[] solutionAnswer = Answer3.solution(progresses, speeds);

        ArrayList<Integer> correctAnswerInteger = new ArrayList<>();
        for(int num : correctAnswer){
            correctAnswerInteger.add(num);
        }
        ArrayList<Integer> solutionAnswerInteger = new ArrayList<>();
        for(int num : solutionAnswer){
            solutionAnswerInteger.add(num);
        }

        System.out.println(correctAnswerInteger);
        System.out.println(solutionAnswerInteger);

        Assert.assertEquals(correctAnswerInteger.toString(), solutionAnswerInteger.toString());
    }
}
