package ch3;

public class OperatorEx15 {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char upperCase = (char) (lowerCase -32); // 'A'. 대문자와 소문자간의 코드값차이는 10진수로 32이다.
        System.out.println(upperCase);  // char 형과 int 형 간의 뺄셈연산 결과는 int형이다. 따라서 char형으로 출력하기 위해서는 다시 형변환해야한다.

    }
}
