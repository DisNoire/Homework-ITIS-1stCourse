package com.company;

import java.text.ParseException;
import java.util.GregorianCalendar;

/**
 * Created by DisNoire on 09.11.2016.
 */
public class ListOfMeetUps {
    MeetUp[] meetUps = new MeetUp[1000];
    int index = 0;
    MeetUp meetUpDefault = new MeetUp("Default", 01, 01, 0001, "Monday", 00, 00,"Default info");

    ListOfMeetUps(){
        for (int j = 0;j<meetUps.length; j++){
            meetUps[j] = meetUpDefault;
        }
    }

    public void add(MeetUp meetUp){
        meetUps[index] = meetUp;
        index++;
    }

    public  void  del(String name){
        for (MeetUp meetUp : meetUps)
            if (meetUp.name.equals(name)) {
                meetUp = meetUpDefault;
            }
    }

    public void print1MeetUp(String name){
        for (MeetUp meetUp : meetUps){
            if (meetUp.name.equals(name))meetUp.printInfo();
        }
    }

    public void printByDay(GregorianCalendar gregorianCalendar){
        for (MeetUp meetUp : meetUps){
            if (meetUp.gregorianCalendar.equals(gregorianCalendar))meetUp.printInfo();
        }
    }

    public void printInfos(){
        for (int i = 0;i<index;i++) {
            if (meetUps[i].dayOfWeek.equals("Monday")) {
                if (meetUps[i].name.equals("Default")) System.out.println();
                else meetUps[i].printInfo();
            }
            if (meetUps[i].dayOfWeek.equals("Tuesday")) {
                if (meetUps[i].name.equals("Default")) System.out.println();
                else meetUps[i].printInfo();
            }
            if (meetUps[i].dayOfWeek.equals("Wednesday")) {
                if (meetUps[i].name.equals("Default")) System.out.println();
                else meetUps[i].printInfo();
            }
            if (meetUps[i].dayOfWeek.equals("Thursday")) {
                if (meetUps[i].name.equals("Default")) System.out.println();
                else meetUps[i].printInfo();
            }
            if (meetUps[i].dayOfWeek.equals("Friday")) {
                if (meetUps[i].name.equals("Default")) System.out.println();
                else meetUps[i].printInfo();
            }
            if (meetUps[i].dayOfWeek.equals("Saturday")) {
                if (meetUps[i].name.equals("Default")) System.out.println();
                else meetUps[i].printInfo();
            }
            if (meetUps[i].dayOfWeek.equals("Sunday")) {
                if (meetUps[i].name.equals("Default")) System.out.println();
                else meetUps[i].printInfo();
            }
        }
    }
}
