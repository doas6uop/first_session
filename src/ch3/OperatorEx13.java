package ch3;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

//        char c2 = c1 + 1; // 컴파일에러 발생. 변수가 들어가 있는 경우 컴파일러가 계산을 수행할 수 없기 때문에 형변환해주어야한다.
        char c2 = 'a' + 1;  // 컴파일에러 없음. 리터럴간의 연산.

        System.out.println(c2);
    }
}
