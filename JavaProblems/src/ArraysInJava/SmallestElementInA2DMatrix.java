package ArraysInJava;

public class SmallestElementInA2DMatrix {

    public static void main(String[] args) {

        int matrix[][]= {{2,3,4},{3,5,7},{4,-1,0}}; //just defined a 2D matrix for example

        int smallest=matrix[0][0];
        int rows=  matrix.length;
        int cols= matrix[1].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }

            }
        }

        System.out.println(smallest);

    }
}
