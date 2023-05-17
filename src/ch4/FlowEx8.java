package ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민등록번호를 입력하세용 (000000-1111111)> ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);  // 입력받은 번호의 8번째 문자를 저장. 유니코드가 저장되기 때문에 switch에 사용할 수 있다.

        switch (gender) {
            case '1': case '3':
                System.out.println("남자");
                break;
            case '2': case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("뭘쓴거임");
        }
    }
}
