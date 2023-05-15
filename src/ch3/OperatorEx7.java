package ch3;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a * b); // 44
        System.out.println(c);
        // 10 * 30 = 300
        // byte 간의 계산으로 int 타입으로 cating 된 후 다시 byte로 명시적 형변환된다.
        // 이때 300은 byte형의 범위를 넘기 때문에 데이터손실이 일어난다.

    }
}
