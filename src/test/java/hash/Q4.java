package hash;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q4 {
    @Test
    public void case1(){
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        Assert.assertEquals(Arrays.toString(new int[]{4, 1, 3, 0}), Arrays.toString(Answer4.solution(genres, plays)));
    }
    @Test
    public void case2(){
        String[] genres = {"classic","pop","classic","pop","classic","classic"};
        int[] plays = {400,600,150,2500,500,500};
        Assert.assertEquals(Arrays.toString(new int[]{3, 1, 4, 5}), Arrays.toString(Answer4.solution(genres, plays)));
    }
    @Test
    public void case3(){
        String[] genres = {"jazz","pop","classic","pop","classic","classic"};
        int[] plays = {400,600,150,2500,500,500};
        Assert.assertEquals(Arrays.toString(new int[]{3, 1, 4, 5, 0}), Arrays.toString(Answer4.solution(genres, plays)));
    }
}
