package ch5;

public class ArrayEx16 {
    public static void main(String[] args) {
        if (args != null) { // args가 null이 아닐 때만 블럭 내의 문장들을 수행

            int num = Integer.parseInt("123");
            System.out.println("매개변수의 개수: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] - \"" + args[i] + "\"");
            }
        }
    }
}