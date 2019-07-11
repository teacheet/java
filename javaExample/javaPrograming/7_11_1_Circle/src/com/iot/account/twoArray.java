public class twoArray {
    public static void main(String[] args) {
        multiArray();
    }
    public static void multiArray(){
        //1차원이든 2차원이든 배열도 객체이다
        //배열객체 만이 length field를 사용 할 수 있다
//        int intArrays[][] = new int [5][];
//
//        intArrays[0] = new int[1];
//        intArrays[1] = new int[2];
//        intArrays[2] = new int[3];
//        intArrays[3] = new int[4];
//        intArrays[4] = new int[5];
//
//        int increment = 0;
//        for(int i = 0 ; i < 5 ; i++ ){
//            for(int j = 0 ; j <intArrays[i].length ; j++ ){
//                intArrays[i][j] = ++increment;
//            }
//        }
//
//        for(int i = 0 ; i < intArrays.length ; i++ ){
//            for(int j = 0 ; j <intArrays[i].length ; j++ ){
//                System.out.format("%d " , intArrays[i][j]);
//            }
//            System.out.format("\n");
//        }
        int intArrays[][] = new int [8][9];

        for(int i = 0; i < intArrays.length;i++){
            for(int j = 0; j < intArrays[i].length;j++){
                intArrays[i][j] = (i+2)*(j+1);
            }
        }

        int firstLength = intArrays.length;
        for(int i = 0; i < firstLength;i++){
            System.out.format("========== %d단 ========== \n",i+2);
            int arrayLength = intArrays[i].length;
            for(int j = 0; j < arrayLength;j++){
                System.out.format("%d x %d = %d   " ,i+2,j+1,intArrays[i][j]);
            }
            System.out.format("\n");
        }

    }



}
