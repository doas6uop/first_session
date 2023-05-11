package ch2;

public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f); // float 타입의 값을 int 타입의 값으로 해석하여 반환한다.

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i); // 16진수로 출력
    }
}
