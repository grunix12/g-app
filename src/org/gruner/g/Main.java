package org.gruner.gcalc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Date d = new Date();

        Calendar gdate = Calendar.getInstance();
        gdate.set(2018, Calendar.MAY, 31);
        gdate.get(Calendar.DAY_OF_MONTH);

        Calendar cal = new GregorianCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setTimeZone(cal.getTimeZone());
        System.out.println( dateFormat.format(cal.getTime()));

        for (int i = 0; i < 60; i++) {
            System.out.println(dateFormat.format(gdate.getTime()) + " G ");
            gdate.add(Calendar.DAY_OF_MONTH,2*1);
            System.out.println(dateFormat.format(gdate.getTime()) + "   / kr ");
            gdate.add(Calendar.DAY_OF_MONTH,2*1);

        }

    }

    public class Test
    {




        public void Test () {}



        public void run()
        {
            System.out.println("running!");
        }

    }
}
