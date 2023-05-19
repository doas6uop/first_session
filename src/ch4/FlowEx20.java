package ch4;

public class FlowEx20 {
    public static void main(String[] args) {
        // 2중 반복문 i, j를 이용하여 두 값을 쌍으로 출력한다.
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++)
                    System.out.printf("[%d, %d] ", i, j);
            System.out.println();
        }
    }
}
