package org.example;

public class BookService {

    private final BookDao DAO;

    public BookService() {
        this.DAO = new BookDao();
    }

    // este método invoca el método guardar de la clase DAO padre para
    // persistir un objeto Mascota
    public Book createBook(String title, Integer copy, Integer borrowed) {
        Book b = new Book();
        try {
            b.setTitle(title);
            b.setCopy(copy);
            b.setBorrowedCopies(borrowed);
            DAO.guardar(b);
            return b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
