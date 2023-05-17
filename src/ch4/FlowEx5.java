package ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력하세용> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); //  화면을 통해 입력받은 숫자를 score에 저장
        System.out.printf("당신의 점수는 %d입니다. %n", score);

        if(score >= 90) {               // socre가 90 이상일 때 A(grade)
            grade = 'A';
            if (score >= 98) {          // 그 중 98 이상은 A+
                opt = '+';
            } else if (score < 94) {   // 그 중 94 이하는 A-
                opt = '-';
            }
        } else if (score >= 80) {       // score가 80이상일 때 B(grade)
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {                        // 나머지는 C(grade)
            grade = 'C';
        }
            System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
    }
}
