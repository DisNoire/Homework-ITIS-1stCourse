package com.company;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Created by DisNoire on 09.11.2016.
 */
public class MeetUp {
    String name;
    String dayOfWeek;
    GregorianCalendar gregorianCalendar;
    SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd MMM yyyy hh:mm aa");
    String info;

    MeetUp(String name,int date,int month,int year, String dayOfWeek, int hourOfDay, int minute, String info){
        this.name = name;
        this.dayOfWeek = dayOfWeek;
        this.gregorianCalendar = new GregorianCalendar(year,month-1,date,hourOfDay,minute);
        this.info = info;
    }

    public void printInfo(){
        System.out.println("____________________________________");
        System.out.println(this.dayOfWeek);
        System.out.println(simpleDateFormat.format(gregorianCalendar.getTime()));
        System.out.println(this.name);
        System.out.println(this.info);
        System.out.println("____________________________________");
        System.out.println();
    }
}

