package com.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] ar = line.split(", ");
            Article article = new Article(ar[0], ar[1], ar[2]);
            articles.add(article);
        }
        for (Article a : articles){
            System.out.println(a);
        }
    }
    public static class Article{
        String title;
        String content;
        String author;

        public Article (String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public String getContent() {
            return content;
        }

        public String getTitle() {
            return title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }
}
