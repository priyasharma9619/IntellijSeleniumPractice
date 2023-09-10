package sampleApp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate = dformat.format(date);
        System.out.println(formatedDate);
    }
}
