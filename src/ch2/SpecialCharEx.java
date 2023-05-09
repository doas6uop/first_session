package ch2;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');               // 이미 특정한 기능으로 동작하고 있는 특수기호의 경우, 문자열 내부에 포함하기 위해서는 별도의 표기법이 필요하다.
        System.out.println("\"Hello\"");        // " 표기
        System.out.println("123\t456\b789");    // \t에 의해 3-4구간에서 한 번 tab 6-7구간 중 \b에 의해 6이 지워진다.
        System.out.println('\n');               // \n에 의해 한 번 더 개행(new line)된다.
        System.out.println("c:\\");             // \ 표기
    }
}
