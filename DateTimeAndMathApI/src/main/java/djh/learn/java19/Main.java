package djh.learn.java19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd/MMMM/yyyy hh:mm:ss z a");
        Date today = new Date();
        System.out.println(format.format(today));

        System.out.println(today.getDate());
        System.out.println(today.getYear());
        System.out.println(today.getDay());
        System.out.println(today.getMonth());
        System.out.println(today.getTime());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date date = dateFormat.parse("12/10/2021");
        System.out.println(date);
    }
}