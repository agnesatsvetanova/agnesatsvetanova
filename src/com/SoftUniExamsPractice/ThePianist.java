package com.SoftUniExamsPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, PieceInfo> pieces = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\|");
            PieceInfo pieceInfo = new PieceInfo(line[1], line[2]);
            pieces.put(line[0], pieceInfo);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            if (command.startsWith("Add")) {
                String[] split = command.replace("Add|", "").split("\\|");
                String piece = split[0];
                String composer = split[1];
                String key = split[2];
                if (!pieces.containsKey(piece)){
                    PieceInfo pieceInfo = new PieceInfo(composer, key);
                    pieces.put(piece, pieceInfo);
                    //"{piece} by {composer} in {key} added to the collection!"
                    System.out.println(piece + " by " + composer + " in " + key + " added to the collection!");
                } else {
                    System.out.println(piece + " is already in the collection!");
                }

            } else if (command.startsWith("Remove")) {
                String pieceToRemove = command.replace("Remove|", "");
                if (pieces.containsKey(pieceToRemove)){
                    pieces.remove(pieceToRemove);
                    System.out.println("Successfully removed " + pieceToRemove + "!");
                } else {
                    System.out.println("Invalid operation! " + pieceToRemove + " does not exist in the collection.");
                }

            } else if (command.startsWith("ChangeKey")) {
                String[] split = command.replace("ChangeKey|", "").split("\\|");
                String piece = split[0];
                String key = split[1];
                if (pieces.containsKey(piece)){
                    PieceInfo curr = pieces.get(piece);
                    curr.changeKey(key);
                    pieces.put(piece, curr);
                    System.out.println("Changed the key of " + piece + " to " + key + "!");
                } else {
                    System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                }

            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, PieceInfo> p : pieces.entrySet()){
            //"{Piece} -> Composer: {composer}, Key: {key}"
            System.out.println(p.getKey() + " -> Composer: " + p.getValue(). getComposer() + ", Key: " + p.getValue().getKey());
        }
    }

    private static class PieceInfo {
        String composer;
        String key;

        public PieceInfo(String composer, String key) {
            this.composer = composer;
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void changeKey(String key){
            this.key = key;
        }

        public String getComposer() {
            return composer;
        }
    }
}
