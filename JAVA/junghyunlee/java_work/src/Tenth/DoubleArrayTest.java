package Tenth;

public class DoubleArrayTest {
    public static void main(String[] args) {
        //int[][] arr = new int[][]];
        int[][] arr = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        //  [0] [1] [2]
        // -------------
        // | 1 | 0 | 0 |   [0]
        // -------------
        // | 0 | 1 | 0 |   [1]
        // -------------
        // | 0 | 0 | 1 |   [2]
        // -------------


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                // 이중 배열의 경우 안쪽에 있는 녀석이 큰 공간이다.
                /// 바깥쪽에 있는 배열은 큰 공간을 다시 나눈 작은 공간이다.
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("new를 통해 Heap에 할당하기");

        int[][] mat = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                mat[i][j] = (i + 1) * (j + 1);
                System.out.printf("%2d", mat[i][j]);
            }
            System.out.println("");
        }
    }
}
