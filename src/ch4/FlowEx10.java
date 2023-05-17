package ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요 (1~100)> ");

        Scanner scanner = new Scanner(System.in);
        String tmp  = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
        // switch문을 사용할 때는 적절한 조건식을 구성하여 case문을 간결하게 만드는 것이 중요하다.
    }
}
