public class SwapWithoutTempVariable {
    public static void main(String args[]){
        int a= 17;
        int b= 0;

        a= a+b;
        b= a-b;
        a=a-b;

       System.out.println(" a = "+ a);
       System.out.println(" b = "+ b);


    }

}
