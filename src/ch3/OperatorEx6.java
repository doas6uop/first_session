package ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b); // a + b 시 byte간에 덧셈으로 int가 됨. byte 변수에 담기 위해서는 명시적 형변환 필요.
        System.out.println(c);
    }
}
