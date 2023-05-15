package ch3;

public class OperatorEx3 {
    public static void main(String[] args) {
        int i = 5, j = 5;
        System.out.println(i++); // i는 값이 증가하기 전에 참조된다. 5.
        System.out.println(++j); // j는 값이 증가한 후에 참조된다. 6.
        System.out.println("i = " + i + ", j = " + j); // 증가한 값이 참조된다. 6, 6.
    }
}
