package org.example;

public class Main {
    public static void main(String[] args) {

        BookService service = new BookService();

        service.createBook("De que hablo cuando hablo de correr", 12, 12);
    }
}