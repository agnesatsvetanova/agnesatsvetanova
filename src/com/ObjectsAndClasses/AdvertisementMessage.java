package com.ObjectsAndClasses;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededMessageCount = Integer.parseInt(scanner.nextLine());
        List<String> phrases = new ArrayList<String>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<String>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<String>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<String>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));
        for (int i = 0; i < neededMessageCount ; i++) {
            int p =  ThreadLocalRandom.current().nextInt(0, phrases.size());
            int e =  ThreadLocalRandom.current().nextInt(0, events.size());
            int a =  ThreadLocalRandom.current().nextInt(0, authors.size());
            int c =  ThreadLocalRandom.current().nextInt(0, cities.size());
            Message m = new Message(phrases.get(p), events.get(e), authors.get(a), cities.get(c));
            System.out.println(m);
        }
    }
    private static class Message {
        private String phrases;
        private String events;
        private String authors;
        private String cities;

        public Message(String phrases, String events, String authors, String cities) {
            this.phrases = phrases;
            this.events = events;
            this.authors = authors;
            this.cities = cities;
        }

        public String getPhrases() {
            return phrases;
        }

        public String getEvents() {
            return events;
        }

        public String getAuthors() {
            return authors;
        }

        public String getCities() {
            return cities;
        }

        @Override
        public String toString() {
            return phrases + " " + events + " " + authors + " " + cities;
        }
    }
}
