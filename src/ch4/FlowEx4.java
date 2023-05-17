package ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;      // 점수를 저장하기 위한 변수
        char grade = ' ';   // 학점을 저장하기 위한 변수. 공백으로 초기화.

        System.out.print("점수를 입력하세용> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); //  화면을 통해 입력받은 숫자를 score에 저장

        if(score >= 90) {               // socre가 90 이상일 때 A
            grade = 'A';
        } else if (score >= 80) {       // score가 80이상일 때 B
            grade = 'B';
        } else if (score >= 70) {       // score가 70이상일 때 C
            grade = 'C';
        } else {                        // 나머지는 D
            grade = 'D';
        }
            System.out.println("당신의 학점은 " + grade + "입니다. ");
    }
}
