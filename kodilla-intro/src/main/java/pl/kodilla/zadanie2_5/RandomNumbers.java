package pl.kodilla.zadanie2_5;

import java.util.Random;

public class RandomNumbers {


    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;
    private int counter = 5000;
    private long sum = 0L;

    public void calcSum() {
        Random random = new Random();
        while (sum < counter) {
            int tempValue = random.nextInt(3) + 1;
            findMax(tempValue);
            findMin(tempValue);
            sum += tempValue;
        }
    }


    private void findMin(int value) {
        if (value < this.min) {
            this.min = value;
        }
    }

    private void findMax(int value) {
        if (value > this.max) {
            this.max = value;
        }
    }

    public void printResult() {
        System.out.println(String.format("Sum:%s min:%s max:%s", sum, min, max));
    }

}
