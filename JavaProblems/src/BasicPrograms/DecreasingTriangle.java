package BasicPrograms;

/*
o/p
1234
567
89
10
 */
public class DecreasingTriangle {
    public static void main(String[] args) {

        int count=1;
        int row=4;
        int col=4;
        for(int i=0; i<row; i++){
            for(int j=1; j<=col ; j++){
                System.out.print(count);
                count++;
            }
            System.out.print("\n");
            col--;
        }
    }
}