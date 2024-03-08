package org.example.classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookService {
    private Book[] Books = new Book[]{};

    public void setBooks(Book[] books) {
        Books = books;
    }

    public Book[] getBooks() {
        return Books;
    }

    public Book[] GetSortedByName(boolean ascending) {
        Comparator<Book> comparator = (Book a, Book b) -> a.Name().compareToIgnoreCase(b.Name());
        if (ascending) {
            comparator = comparator.reversed();
        }

        return Arrays.stream(Books)
                .sorted(comparator)
                .toArray(Book[]::new);

    }

    public Book[] GetSortedByAuthor(boolean ascending) {
        Comparator<Book> comparator = (Book a, Book b) -> a.Author().compareToIgnoreCase(b.Author());
        if (ascending) {
            comparator = comparator.reversed();
        }

        return Arrays.stream(Books)
                .sorted(comparator)
                .toArray(Book[]::new);
    }

    public Book[] GetSortedByPublicationYear(boolean ascending) {
        Comparator<Book> comparator = Comparator.comparingInt(Book::PublicationYear).reversed();
        if (ascending) {
            comparator = comparator.reversed();
        }

        return Arrays.stream(Books)
                .sorted(comparator)
                .toArray(Book[]::new);
    }
    public Book[] GetSortedByPrice(boolean ascending) {
        Comparator<Book> comparator = (Book a, Book b) -> -Float.compare(a.Price(), b.Price());
        if (ascending) {
            comparator = comparator.reversed();
        }

        return Arrays.stream(Books)
                .sorted(comparator)
                .toArray(Book[]::new);
    }
}
