package ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 클래스의 객체를 생성

        System.out.print("정수 입력: ");
        String input = sc.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); // input 을 Integer 타입의 값으로 변환

        System.out.println("입력내용: " + input);
        System.out.printf("num=%d%n", num); // 공백, 문자, 기호 등 숫자가 아닌 값을 입력하면 Integer.parseInt()에서 에러가 발생한다.
    }
}
