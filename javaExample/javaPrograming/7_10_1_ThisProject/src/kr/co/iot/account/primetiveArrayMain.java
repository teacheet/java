package kr.co.iot.account;

public class primetiveArrayMain {
    public static void main(String[] args) {
        /*
        * int 배열 10개를 만들고 각 index에 1부터 10까지 초기화 시키는 예제
        * */
//        System.out.println("======== 첫번째 ========");
//        initFirstArray();
        swithchCase();
    }
    public static void initFirstArray(){

        int jumsu [][] = new int[8][9];
        for(int j = 0; j<jumsu.length;j++) {

            for (int i = 0; i < jumsu[j].length; i++) {
                jumsu[j][i] = (j + 2) * (i + 1);
            }

            for (int i = 0; i < jumsu[j].length; i++) {
                if (i + 1 == jumsu[j].length) {
                    System.out.print(jumsu[j][i]);
                } else {
                    System.out.print(jumsu[j][i] + ",");
                }
            }
            System.out.println();
        }
    }
    private static final int RAINBOW_VALUE = 7;

    public static void swithchCase(){
//        if(RAINBOW_VALUE == 1){
//            System.out.println("빨");
//        } else if (RAINBOW_VALUE == 2) {
//            System.out.println("주");
//        } else if (RAINBOW_VALUE == 3) {
//            System.out.println("노");
//        } else if (RAINBOW_VALUE == 4) {
//            System.out.println("초");
//        } else if (RAINBOW_VALUE == 5) {
//            System.out.println("파");
//        } else if (RAINBOW_VALUE == 6) {
//            System.out.println("남");
//        } else {
//            System.out.println("보");
//        }
        switch (RAINBOW_VALUE){
            case 1 :
                System.out.println("빨");
                break;
            case 2 :
                System.out.println("주");
                break;
            case 3 :
                System.out.println("노");
                break;
            case 4 :
                System.out.println("초");
                break;
            case 5 :
                System.out.println("파");
                break;
            case 6 :
                System.out.println("남");
                break;

            default :
                System.out.println("보");
                break;
        }
    }


}
