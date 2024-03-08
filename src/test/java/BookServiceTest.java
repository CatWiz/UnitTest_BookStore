import org.example.classes.Book;
import org.example.classes.BookService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {
    private final BookService bookService = new BookService();

    private static List<Arguments> provideGetSortedByNameArguments() {
        return List.of(
                Arguments.of(
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Harry Potter", "JKR", 2019, 300)
                        },
                        false,
                        new Book[]{
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Harry Potter", "JKR", 2019, 300),
                        }
                ),
                Arguments.of(
                        new Book[]{
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Book1", "Some Guy", 2021, 100),
                        },
                        true,
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                        }
                ),
                Arguments.of(
                        new Book[]{},
                        false,
                        new Book[]{}
                ),
                Arguments.of(
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100)
                        },
                        false,
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100)
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideGetSortedByNameArguments")
    void testGetSortedByName(Book[] inputBooks, boolean ascending, Book[] expected) {
        // Arrange
        bookService.setBooks(inputBooks);

        // Act
        var actual = bookService.GetSortedByName(ascending);

        // Assert
        assertArrayEquals(expected, actual);
    }

    private static List<Arguments> provideGetSortedByAuthorArguments() {
        return List.of(
                Arguments.of(
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Harry Potter", "JKR", 2019, 300)
                        },
                        false,
                        new Book[]{
                                new Book("Harry Potter", "JKR", 2019, 300),
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                        }
                ),
                Arguments.of(
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                        },
                        true,
                        new Book[]{
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Book1", "Some Guy", 2021, 100),
                        }
                ),
                Arguments.of(
                        new Book[]{},
                        false,
                        new Book[]{}
                ),
                Arguments.of(
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100)
                        },
                        false,
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100)
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideGetSortedByAuthorArguments")
    void testGetSortedByAuthor(Book[] inputBooks, boolean ascending, Book[] expected) {
        // Arrange
        bookService.setBooks(inputBooks);

        // Act
        var actual = bookService.GetSortedByAuthor(ascending);

        // Assert
        assertArrayEquals(expected, actual);
    }

    private static List<Arguments> provideGetSortedByPublicationYearArguments() {
        return List.of(
                Arguments.of(
                        new Book[]{
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Harry Potter", "JKR", 2019, 300)
                        },
                        false,
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Harry Potter", "JKR", 2019, 300),
                        }
                ),
                Arguments.of(
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                        },
                        true,
                        new Book[]{
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Book1", "Some Guy", 2021, 100),
                        }
                ),
                Arguments.of(
                        new Book[]{},
                        false,
                        new Book[]{}
                ),
                Arguments.of(
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100)
                        },
                        false,
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100)
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideGetSortedByPublicationYearArguments")
    void testGetSortedByPublicationYear(Book[] inputBooks, boolean ascending, Book[] expected) {
        // Arrange
        bookService.setBooks(inputBooks);

        // Act
        var actual = bookService.GetSortedByPublicationYear(ascending);

        // Assert
        assertArrayEquals(expected, actual);
    }

    private static List<Arguments> provideGetSortedByPriceArguments() {
        return List.of(
                Arguments.of(
                        new Book[]{
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Harry Potter", "JKR", 2019, 300)
                        },
                        false,
                        new Book[]{
                                new Book("Harry Potter", "JKR", 2019, 300),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Book1", "Some Guy", 2021, 100),
                        }
                ),
                Arguments.of(
                        new Book[]{
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                                new Book("Book1", "Some Guy", 2021, 100),
                        },
                        true,
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100),
                                new Book("Anarchists' Cookbook", "Unknown", 2020, 200),
                        }
                ),
                Arguments.of(
                        new Book[]{},
                        false,
                        new Book[]{}
                ),
                Arguments.of(
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100)
                        },
                        false,
                        new Book[]{
                                new Book("Book1", "Some Guy", 2021, 100)
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideGetSortedByPriceArguments")
    void testGetSortedByPrice(Book[] inputBooks, boolean ascending, Book[] expected) {
        // Arrange
        bookService.setBooks(inputBooks);

        // Act
        var actual = bookService.GetSortedByPrice(ascending);

        // Assert
        assertArrayEquals(expected, actual);
    }
}
