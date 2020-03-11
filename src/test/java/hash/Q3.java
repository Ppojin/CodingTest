package hash;

import org.junit.Assert;
import org.junit.Test;

public class Q3 {
    @Test
    public void case1(){
        String[][] v = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Answer3 answer3 = new Answer3();
        Assert.assertEquals(5, answer3.solution(v));
    }

    @Test
    public void case2(){
        String[][] v = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        Answer3 answer3 = new Answer3();
        Assert.assertEquals(3, answer3.solution(v));
    }

    @Test
    public void case3(){
        String[][] v = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}, {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        Answer3 answer3 = new Answer3();
        Assert.assertEquals(23, answer3.solution(v));
    }
}
