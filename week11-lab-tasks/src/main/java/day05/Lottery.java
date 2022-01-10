package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int maxNumber;
    private int amount;

    public Lottery(int maxNumber, int amount) {
        this.maxNumber = maxNumber;
        this.amount = amount;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getAmount() {
        return amount;
    }

    public List<Integer> startLottery(){
        List<Integer> numbers= new ArrayList<>();
        Random random = new Random();
        int tmp= random.nextInt(maxNumber+1);
        int i=0;
        while(i<amount){
            if(!numbers.contains(tmp)){
                numbers.add(tmp);
                ++i;
            }
            tmp=random.nextInt(maxNumber+1);

        }
        return numbers;
    }
}
