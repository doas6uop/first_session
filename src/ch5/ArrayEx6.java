package ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        // 배열의 최대값, 최소값을 첫번째값으로 초기화
        int max = score[0];
        int min = score[0];

        for(int i =0; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
