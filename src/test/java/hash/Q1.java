package hash;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

class V{
    private String[] participant;
    private String[] completion;
    private String result;

    public V(String[] participant, String[] completion, String result) {
        this.participant = participant;
        this.completion = completion;
        this.result = result;
    }

    public String[] getParticipant() {
        return participant;
    }

    public String[] getCompletion() {
        return completion;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "V{" +
                "participant=" + Arrays.toString(participant) +
                ", completion=" + Arrays.toString(completion) +
                ", result='" + result + '\'' +
                '}';
    }
}

public class Q1 {

    @Test
    public void case1(){
        V v = new V(
                new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"},
                "leo"
        );
        Answer1 answer1 = new Answer1();
        Assert.assertEquals(answer1.solution(v.getParticipant(), v.getCompletion()), v.getResult());
    }
    @Test
    public void case2(){
        V v = new V(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"},
                "vinko"
        );
        Answer1 answer1 = new Answer1();
        Assert.assertEquals(answer1.solution(v.getParticipant(), v.getCompletion()), v.getResult());
    }
    @Test
    public void case3(){
        V v = new V(
                new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"},
                "mislav"
        );
        Answer1 answer1 = new Answer1();
        Assert.assertEquals(answer1.solution(v.getParticipant(), v.getCompletion()), v.getResult());
    }
}
