package ch3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        System.out.print("문자를 하나 입력하세용> ");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9') System.out.printf("입력하신 문자는 숫자입니당> ");
        if('a' <= ch && ch <= 'z') System.out.printf("입력하신 문자는 영어예용> ");
    }
}
