import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SW {

    public static void main(String[] arg)
    {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        //System.out.println( "Hello World");


    }
}
