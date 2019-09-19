package com.elephant.study;
import java.util.Arrays;
public class Day01Demo {
    public static  void main(String[] args) {
        int[] scores ={89,-23,64,91,119,52,73};
        System.out.print("考试成绩的前三名为：");
        Day01Demo test=new Day01Demo();
        test.getarrays(scores);
    }
    public void getarrays(int[] scores){
        Arrays.sort(scores);
        int count=1
        for(int i=scores.length-1;)
    }
}
