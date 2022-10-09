package com.company;

public class Main {
    private int sum = 0;

    public static void main(String[] args) {
        try {
            Main obj = new Main();
            obj.run(args);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run(String[] args) throws Exception {
        final int[] numbers = new int[] {1, 2, 3, 4, 5};
        forIntArray(numbers);
        System.out.println(String.format("after for = %d", this.sum));
        setSum(0);

        whileIntArray(numbers);
        System.out.println(String.format("after while = %d", this.sum));
        setSum(0);

        doWhileIntArray(numbers);
        System.out.println(String.format("after do while = %d", this.sum));
        setSum(0);
    }

    public void forIntArray(int[] array) {
        for (int index = 0; index < array.length; index += 1) {
            final int newSum = this.sum + array[index];
            this.setSum(newSum);
        }
    }

    public void whileIntArray(int[] array) {
        int index = 0;
        while (index != array.length) {
            final int newSum = this.sum + array[index];
            this.setSum(newSum);
            index += 1;
        }
    }

    public void doWhileIntArray(int[] array) {
        int index = 0;
        do {
            final int newSum = this.sum + array[index];
            this.setSum(newSum);
            index += 1;
        } while (index < array.length);
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
