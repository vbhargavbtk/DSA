import java.util.Arrays;

public class BinarySearchRowColumnMatrices {
    public static void main(String[] args) {
        int[][] arr={
            {13,15,17,19},
            {25,26,27,89},
            {28,29,30,99},
            {37,38,39,100}
        };
        int target=3;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] matrix,int target){
        int row=0;
        int col=matrix.length-1;
        while(row<=matrix.length && col>0){
            if(target==matrix[row][col]){
                return new int[] {row,col};
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
