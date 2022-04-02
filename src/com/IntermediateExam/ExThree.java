package com.IntermediateExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExThree {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String startingPhones = scanner.nextLine();
        startingPhones = startingPhones.replaceAll("\\s+","");
        String[] sPhones = startingPhones.split(",");
        phones.addAll(Arrays.asList(sPhones));
        boolean endReached = false;
        while(!endReached) {
            String command = scanner.nextLine();
            if(command.equals("End")) {
                endReached = true;
            } else if(command.startsWith("Add - ")) {
                String curPhone = command.substring(6);
                if(!phones.contains(curPhone)) {
                    phones.add(curPhone);
                }
            } else if(command.startsWith("Remove - ")) {
                String curPhone = command.substring(9);
                phones.remove(curPhone);
            } else if(command.startsWith("Bonus phone - ")) {
                String curPhone = command.substring(14);
                String[] twoP = curPhone.split(":");
                String oldPhone = twoP[0];
                String newPhone = twoP[1];
                if(phones.contains(oldPhone)) {
                    int indOld = phones.indexOf(oldPhone);
                    phones.add(indOld+1, newPhone);
                }
            } else if(command.startsWith("Last - ")) {
                String curPhone = command.substring(7);
                if(phones.contains(curPhone)) {
                    phones.remove(curPhone);
                    phones.add(curPhone);
                }

            }
        }
        for(int i=0;i<phones.size();i++) {
            System.out.print(phones.get(i));
            if(i != phones.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
