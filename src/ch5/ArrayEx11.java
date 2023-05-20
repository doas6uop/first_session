package ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i=0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i < numArr.length; i++) {
            counter[numArr[i]]++; // 동일한 인덱스요소에 해당하는 값을 증가시킨다
        }

        for(int i=0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    }
}