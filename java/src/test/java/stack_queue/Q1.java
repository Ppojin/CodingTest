package stack_queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q1 {
    @Test
    public void case1(){
        int[] input = {6,9,5,7,4};
        System.out.println(Arrays.toString(input));
        int[] rightAnswer = {0,0,2,2,4};
        Answer1 answer1 = new Answer1();
        int[] result = answer1.solution(input);
        Assert.assertEquals(Arrays.toString(rightAnswer), Arrays.toString(result));
    }
    @Test
    public void case2(){
        int[] input = {3,9,9,3,5,7,2};
        System.out.println(Arrays.toString(input));
        int[] rightAnswer = {0,0,0,3,3,3,6};
        Answer1 answer1 = new Answer1();
        int[] result = answer1.solution(input);
        Assert.assertEquals(Arrays.toString(rightAnswer), Arrays.toString(result));
    }
    @Test
    public void case3(){
        int[] input = {1,5,3,6,7,6,5};
        System.out.println(Arrays.toString(input));
        int[] rightAnswer = {0,0,2,0,0,5,6};
        Answer1 answer1 = new Answer1();
        int[] result = answer1.solution(input);
        Assert.assertEquals(Arrays.toString(rightAnswer), Arrays.toString(result));
    }
    @Test
    public void case4(){
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(input));
        int[] rightAnswer = {0, 0, 0, 0, 0, 0, 0};
        Answer1 answer1 = new Answer1();
        int[] result = answer1.solution(input);
        Assert.assertEquals(Arrays.toString(rightAnswer), Arrays.toString(result));
    }
    @Test
    public void case5(){
        int[] input = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(input));
        int[] rightAnswer = {0, 1, 2, 3, 4, 5, 6};
        Answer1 answer1 = new Answer1();
        int[] result = answer1.solution(input);
        Assert.assertEquals(Arrays.toString(rightAnswer), Arrays.toString(result));
    }
    @Test
    public void case6(){
        int[] input = {9, 1, 1, 1};
        System.out.println(Arrays.toString(input));
        int[] rightAnswer = {0, 1, 1, 1};
        Answer1 answer1 = new Answer1();
        int[] result = answer1.solution(input);
        Assert.assertEquals(Arrays.toString(rightAnswer), Arrays.toString(result));
    }
}
