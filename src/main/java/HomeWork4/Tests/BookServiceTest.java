package HomeWork4.Tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import HomeWork4.Book;
import HomeWork4.BookRepository;
import HomeWork4.BookService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        String bookId = "123";
        Book expectedBook = new Book(bookId, "Title", "Author");

        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        Book actualBook = bookService.findBookById(bookId);

        assertEquals(expectedBook, actualBook);
        verify(bookRepository, times(1)).findById(bookId);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book 1", "Author 1"),
                new Book("2", "Book 2", "Author 2"),
                new Book("3", "Book 3", "Author 3")
        );

        when(bookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> actualBooks = bookService.findAllBooks();

        assertEquals(expectedBooks, actualBooks);
        verify(bookRepository, times(1)).findAll();
    }
}
