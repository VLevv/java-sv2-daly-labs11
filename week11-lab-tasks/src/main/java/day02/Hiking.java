package day02;

import java.util.List;

public class Hiking {
    public int getPlusElevation(List<Integer> heights){
        int sum = 0;
        for (int i = 0;i<heights.size()-1;++i){
            if(heights.get(i)<heights.get(i+1)){
                sum += heights.get(i+1) - heights.get(i);
            }
        }
        return sum;
    }
}
