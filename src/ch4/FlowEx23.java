package ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;

        while(--i!=0) {
            System.out.println(i + " - I can do it.");
        }

        // 좀 더 이해하기 쉬운 버전이다.
//        i = 5;
//        while(i!=0) {
//            i--;
//            System.out.println(i + " - I can do it.");
//        }
    }
}
