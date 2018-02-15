package com.oquinn;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> highs= new ArrayList<>(); ArrayList<Integer> lows = new ArrayList<>(); String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        ArrayList<String> cities = new ArrayList<>(); ArrayList<Integer> avgs= new ArrayList<>();

        Map<String,Integer> dis = new TreeMap<>(); int average = 0;

        System.out.print("Input City Name: ");
        String city = s.next();

        while (!city.equals("END")) {
            cities.add(city);
            System.out.println("Input City Name: ");
            city = s.next();
        }

        for(String element : cities) {
            for(String i : days) {
                System.out.print("High for " + i + " for " + element + ": ");
                highs.add(s.nextInt());
                System.out.print("Low for " + i + " for " + element + ": ");
                lows.add(s.nextInt());
            }

            for(int i = 0; i < days.length; i++) {
                avgs.add((highs.get(i) + lows.get(i))/2);
            }

            for(int i : avgs) {
                average += i;
            }

            average = average/days.length;
            avgs.clear();
            dis.put(element, average);
        }

        for(String key: dis.keySet()) {
            System.out.println(key + " - Average Temp: " + dis.get(key).toString() + "F");
        }
    }
}