package java_project;

public class ArrayInArray {
    public static void main(String[] args) {
        // 1. 예제 1
        int[][] arr1 = new int[2][3];

        System.out.println("arr1.length = " + arr1.length);
        System.out.println("arr1[0].length = " + arr1[0].length);
        System.out.println("arr1[1].length = " + arr1[1].length);

        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1[i].length; k++) {
                System.out.print("arr1[" + i + "][" + k + "]=" + arr1[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 예제 2
        int arr2[][] = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%-5d", arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 3. 예제 3
        // 2차원 배열 (가변 배열)
        int[][] arr3 = new int[2][];
        arr3[0] = new int[] { 1, 5 };
        arr3[1] = new int[3];
        for (int i = 0; i < arr3.length; i++) {
            for (int k = 0; k < arr3[i].length; k++) {
                System.out.print("arr3[" + i + "][" + k + "]=" + arr3[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 4. 예제 4
        //5x5 2차원 배열에 1~25로 초기화하여 화면에 출력
        int[][] array = new int[5][5];
        // 배열 초기화
        for (int i = 0, num = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num++;
            }
        }

        // 2차원 배열 출력
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.printf("%-5d", array[i][k]);
            }
            System.out.println();
        }
        System.out.println();
        //배열을 표로 봤을 때 왼쪽에서 오른쪽으로 가로지르는  대각선 순회하는 2차원 배열에서 원하는 요소들만 접근해서 합을 구함
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) { // 대각선 요소들을 i == j로 찾음
                    sum += array[i][j];
                }
            }
        }
        System.out.println("합계 : " + sum);

        // 5. 예제 5
        // 2차원 배열 데이터 출력하기
        
        //배열을 표로 봤을 때 외쪽 대각선 아래 요소들의 합
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.printf("%-5d", array[i][k]);
            }
            System.out.println();
        }
        System.out.println();

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) { // j = i보다 작거나 같다는 정의를 통해서 왼쪽 위에서 오른쪽 아래로 가로지르는 대각선아래 요소들의 합을 구함
                total += array[i][j];
            }
        }
        System.out.println("합계 : " + total);

        System.out.println();
    }
}
