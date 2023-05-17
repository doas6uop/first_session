package ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;
        
        System.out.print("숫자를 하나 입력하세용> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();        // 화면을 통해 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp);          // 입력받은 문자열(tmp)을 숫자로 변환 
        
        if(input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        if(input != 0) System.out.println("입력하신 숫자는 0이 아닙니다.");
        System.out.printf("입력하신 숫자는 %d입니다.", input); // 두번째 if문은 블럭을 생략했기 때문에 세번째 출력문은 입력된 문자에 관계 없이 항상 출력된다.
    }
}
