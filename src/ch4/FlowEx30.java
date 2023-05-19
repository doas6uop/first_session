package ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
         while (true) {
             if(sum > 100) break; // break문이 수행되면 블럭 이하의 부분이 실행되지 않고 while문을 벗어난다.
             ++i;
             sum += i; // sum += ++i로 단축할 수 있다.
         }

         System.out.println("i= " + i);
         System.out.println("sum= " + sum);
    }
}
