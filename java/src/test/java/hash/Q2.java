package hash;


import org.junit.Assert;
import org.junit.Test;

public class Q2 {
    @Test
    public void case1(){
        String[] v = {"119", "97674223", "1195524421"};
        Answer2 answer2 = new Answer2();
        Assert.assertFalse(answer2.solution(v));
    }
    @Test
    public void case2(){
        String[] v = {"123", "456", "789"};
        Answer2 answer2 = new Answer2();
        Assert.assertTrue(answer2.solution(v));
    }
    @Test
    public void case3(){
        String[] v = {"12","123","1235","567","88"};
        Answer2 answer2 = new Answer2();
        Assert.assertFalse(answer2.solution(v));
    }
    @Test
    public void case4(){
        String[] v = {"112", "12", "13"};
        Answer2 answer2 = new Answer2();
        Assert.assertTrue(answer2.solution(v));
    }
    @Test
    public void case5(){
        String[] v = {"123","12"};
        Answer2 answer2 = new Answer2();
        Assert.assertFalse(answer2.solution(v));
    }
}
