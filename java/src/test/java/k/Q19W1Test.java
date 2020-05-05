package k;

import org.junit.Assert;
import org.junit.Test;

public class Q19W1Test{
    @Test
    public void case1(){
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        Q19W1 q = new Q19W1();
        Assert.assertEquals(4, q.solution(board, moves));
    }

}