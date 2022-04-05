package com.FundamentalsFinalExam;

import java.util.*;

public class ExThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> likes = new LinkedHashMap<>();
        int disliked = 0;
        while(!line.equals("Stop")) {
            String[] p = line.split("-");
            if(p[0].equals("Like")) {
                if(likes.containsKey(p[1])) {
                    if(!likes.get(p[1]).contains(p[2])) {
                        likes.get(p[1]).add(p[2]);
                    }
                } else {
                    List<String> newSet = new ArrayList<>();
                    newSet.add(p[2]);
                    likes.put(p[1], new ArrayList<>(newSet));
                }
            } else if(p[0].equals("Dislike")) {
                if(!likes.containsKey(p[1])) {
                    System.out.println(p[1] + " is not at the party.");
                } else if(likes.containsKey(p[1])) {
                    if(!likes.get(p[1]).contains(p[2])) {
                        System.out.println(p[1] + " doesn't have the " + p[2] + " in his/her collection.");
                    } else {
                        System.out.println(p[1] + " doesn't like the " + p[2]+".");
                        likes.get(p[1]).remove(p[2]);
                        disliked++;
                    }
                }
            }
            line = scanner.nextLine();
        }
        for( Map.Entry<String, List<String>> e : likes.entrySet()) {
            System.out.println(e.getKey() + ": " + String.join(", ", e.getValue()));
        }
        System.out.println("Unliked meals: " + disliked);
    }
}
