package DateClassInJava;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDate {
    public static void main(String Args[]){

        Date date= new Date();  //this class in part of java.utl package

        //to print the date
        System.out.println(date.toString());

        //to print the date in required format we have SimpleDateFormat class
        SimpleDateFormat sdf= new SimpleDateFormat("dd/M/yyyy");
        System.out.println(sdf.format(date));

    }
}
