package com.ObjectsAndClasses;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] input = line.split(", ");
        int n = Integer.parseInt(scanner.nextLine());
        Article article = new Article(input[0], input[1], input[2]);
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.contains("Edit: ")){
                String newContent = command.replace("Edit: ", "");
                article.editContent(newContent);
            } else if (command.contains("Rename: ")){
                String newName = command.replace("Rename: ", "");
                article.renameTitle(newName);
            } else if (command.contains("ChangeAuthor: ")){
                String newAuthor = command.replace("ChangeAuthor: ", "");
                article.changeAuthor(newAuthor);
            }
        }
        System.out.println(article);

    }
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void renameTitle(String title) {
            this.title = title;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + " : " + this.author;
        }
    }
}
