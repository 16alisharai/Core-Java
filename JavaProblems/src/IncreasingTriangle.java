/*
o/p
1
2 3
4 5 6
7 8 9 10
*/


public class IncreasingTriangle {



        public static void main(String[] args) {

            int c=1;
            int r=4;


            for(int i=0 ; i<r; i++){
                for(int j=0; j<=i; j++){
                    System.out.print(c);
                    c++;
                }
                System.out.println("\n");
            }

        }
}
