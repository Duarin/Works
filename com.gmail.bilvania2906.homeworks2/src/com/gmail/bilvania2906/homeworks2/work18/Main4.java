package com.gmail.bilvania2906.homeworks2.work18;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Book> list=List.of(
                new Book("Harry Potter", "J.K. Rowling", 30, "Fantasy"),
                new Book("Clean Code", "Robert C. Martin", 25, "Programming"),
                new Book("The Hobbit", "J.R.R. Tolkien", 15, "Fantasy"),
                new Book("Game of Thrones", "George R.R. Martin", 35, "Fantasy"),
                new Book("Java in Action", "Brian Goetz", 40, "Programming")
        );



        System.out.println(list);

        String fantasyBooks = list.stream()
                .filter(book -> book.getPrice()>20)
                .sorted(Comparator.comparingDouble(Book::getPrice))
                .filter(book -> book.getGenre().equals("Fantasy"))
                .map(Book::getTitle)
                .collect(Collectors.joining(", "+"( "+" )"));


        System.out.println(fantasyBooks);

    }
    static class Book{
        private String title;
        private String author;
        private double price;
        private  String genre;

        public Book(String title, String author, double price, String genre){
            this.title=title;
            this.author=author;
            this.price=price;
            this.genre=genre;

        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }

        public String getGenre() {
            return genre;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    ", genre='" + genre + '\'' +
                    '}';
        }
    }
}
