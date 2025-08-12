public class searching2D {
    public static void main(String[] args) {
        int[][] arr={
                {18,9,12},{36,-4,91},{44,33,16}
        };
        int target = 91;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0  ; j < arr.length; j++) {
                if (target==arr[i][j]){
                    System.out.println(" "+i+" "+j);
                }
            }
        }
    }
}
