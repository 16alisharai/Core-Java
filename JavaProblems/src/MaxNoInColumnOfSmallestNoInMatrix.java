//Asked In Cisco

/*

1 2 3
4 5 0
-9 -1 7

 */

public class MaxNoInColumnOfSmallestNoInMatrix {

    public static void main(String args[]){

        int arr[][]={{1,2,3},{4,5,0},{9,-1,7}};
        int row= arr.length;
        int col= arr[0].length;
        int smallest= arr[0][0];
        int colNo=0;

        for(int i=0; i<row ; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                    colNo=j;
                }
            }
        }

        int maximum = smallest;
        for(int i=0; i<row ; i++){

            if(arr[i][colNo]>maximum){
                maximum= arr[i][colNo];

            }
        }

        System.out.println(maximum);

    }

}
