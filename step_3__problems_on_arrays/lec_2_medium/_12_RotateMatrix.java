package step_3__problems_on_arrays.lec_2_medium;
public class _12_RotateMatrix {

    private static int[][] rotate_brute(int arr[][], int n){
        int rotated_arr[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                rotated_arr[j][n-1-i] = arr[i][j];
            }
        }

        return rotated_arr;
    }

    private static void rotateMatrix_optimal(int arr[][], int n){

        for(int i=0; i<n; i++){
            for(int j=i + 1; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        
        for(int i=0; i<n; i++){
            int startColumn = 0, endColumn = n-1;
            while(startColumn < endColumn){
                int temp = arr[i][startColumn];
                arr[i][startColumn] = arr[i][endColumn];
                arr[i][endColumn] = temp;

                startColumn++; endColumn--;
            }
        }
    }
    

    public static void main(String args[]){
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        int n = 4;

        arr = rotate_brute(arr, n);
        rotateMatrix_optimal(arr, n);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+ ", ");
            }
            System.out.println();
        }
    }
    
}
