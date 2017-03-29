package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by DisNoire on 09.11.2016.
 */
public class Interface {
    public static void controler(){
        Scanner scanner = new Scanner(System.in);
        String op = "something";
        ListOfMeetUps listOfMeetUps = new ListOfMeetUps();
        while (!op.equals("end")){
            op = scanner.nextLine();
            if (op.equals("New meet up")){
                System.out.println("Enter info:");
                String info = scanner.nextLine();
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter date:");
                String date = scanner.next();
                System.out.println("Enter day of week:");
                String dayOfWeek = scanner.next();
                System.out.println("Enter time:");
                String time = scanner.next();
                Scanner delimiter = new Scanner(date).useDelimiter("/");
                Scanner delimiter1 = new Scanner(time).useDelimiter(":");
                MeetUp meetUp = new MeetUp(name,delimiter.nextInt(),delimiter.nextInt(),delimiter.nextInt(),
                        dayOfWeek,delimiter1.nextInt(),delimiter1.nextInt(),info);
                listOfMeetUps.add(meetUp);
                delimiter.close();
                delimiter1.close();

            }
            if (op.equals("print all meet ups")){
                listOfMeetUps.printInfos();
            }
            if (op.equals("print meet up")){
                System.out.println("print name of meet up:");
                listOfMeetUps.print1MeetUp(scanner.nextLine());
            }
            if (op.equals("delete meet up")){
                System.out.println("print name of meet up:");
                listOfMeetUps.del(scanner.nextLine());
            }
            if (op.equals("search by day")){
                System.out.println("print date:");
                String date = scanner.next();
                Scanner delimiter = new Scanner(date).useDelimiter("/");
                GregorianCalendar gregorianCalendar = new GregorianCalendar(delimiter.nextInt(),
                        delimiter.nextInt(),delimiter.nextInt());
                listOfMeetUps.printByDay(gregorianCalendar);
            }
        }
    }
}
