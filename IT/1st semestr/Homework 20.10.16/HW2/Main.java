package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("new rifle")){
            if (scanner.nextLine().equals("flintlock")){
                Flintlock flintlock = new Flintlock();
                activitiesForRifles(flintlock);
            }
            if (scanner.nextLine().equals("manual repeating rifle")){
                ManualRepeatingRifle manualRepeatingRifle = new ManualRepeatingRifle(scanner.nextInt());
                activitiesForRifles(manualRepeatingRifle);
            }
        }
        if (scanner.nextLine().equals("new plane")){
            if (scanner.nextLine().equals("plane")){
                Plane plane = new Plane(scanner.nextLine(),scanner.nextInt());
                activitiesForPlanes(plane);
            }
            if (scanner.nextLine().equals("bomber")){
                Bomber plane = new Bomber(scanner.nextLine(),scanner.nextInt());
                activitiesForPlanes(plane);
            }
            if (scanner.nextLine().equals("attack aircraft")){
                AttackAircraft plane = new AttackAircraft(scanner.nextLine(),scanner.nextInt());
                activitiesForPlanes(plane);
            }
        }
    }

    public static void activitiesForRifles(Flintlock flintlock) {
        String op = "something";
        Scanner scanner = new Scanner(System.in);
        while(!op.equals("end")) {
            op = scanner.next();
            if(op.equals("shoot")) {
                flintlock.shoot();
            }
            if(op.equals("clear")) {
                flintlock.clear();
            }
            if(op.equals("reload")) {
                flintlock.reload();
            }
            if(op.equals("text")) {
                System.out.println(flintlock.toString());
            }
            if(op.equals("hash")) {
                System.out.println(flintlock.hashCode());
            }
            if(op.equals("clone")) {
                Flintlock flintlock1 = flintlock.clone();
                if(scanner.next().equals("equals")) {
                    System.out.println(flintlock1.equals(flintlock));
                }
            }
        }
    }

    public static void activitiesForPlanes(Plane plane) {
        String op = "something";
        Scanner scanner = new Scanner(System.in);
        while(!op.equals("end")) {
            op = scanner.next();
            if(op.equals("attack")) {
                plane.attack();
            }
            if(op.equals("text")) {
                System.out.println(plane.toString());
            }
            if(op.equals("hash")) {
                System.out.println(plane.hashCode());
            }
            if(op.equals("clone")) {
                Plane plane1 = plane.clone();
                if(scanner.next().equals("equals")) {
                    System.out.println(plane1.equals(plane));
                }
            }
        }

    }
}
