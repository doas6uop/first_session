package ch4;

public class FlowEx21 {
    public static void main(String[] args) {
        // 2중 반복문 i, j를 이용하여 쌍으로 출력하는 두 값 중 특정 값을 뽑아낸다..
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.printf("[%d, %d] ", i, j);
                } else {
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }
    }
}
