package ch2;

public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // 100000000000L
        long hex = 0xFFFF_FFFF_FFFF_FFFL;

        int octNum = 010; // 8진수 10, 10진수 8
        int hexNum = 0x10; // 16진수 10, 10진수 16
        int binNum = 0b10; // 2진수 10, 10진수 2

        System.out.printf("b= %d%n", b); //
        System.out.printf("s= %d%n", s);
        System.out.printf("c= %c, %d %n", c, (int) c); // 형변환은 반드시 명시되어야 한다.
        System.out.printf("finger=[%5d]%n", finger);    // finger=[   10]
        System.out.printf("finger=[%-5d]%n", finger);   // finger=[10   ]
        System.out.printf("finger=[%05d]%n", finger);   // finger=[00010]
        System.out.printf("big=%d%n", big); // big=100000000000
        // 지시자 %x, %o에 #을 사용하면 접두사 0x, 0이 각각 붙는다. %X는 15진수에 사용되는 접두사와 영문자를 대문자로 출력한다.
        System.out.printf("hex=%x%n", hex); // hex=0xfffffffffffffff
        System.out.printf("hex=%#x%n", hex); // hex=0xfffffffffffffff
        System.out.printf("hex=%#X%n", hex); // hex=0XFFFFFFFFFFFFFFF
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);

    }
}
