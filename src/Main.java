import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Input count of book: ");
        int countOfBook = in.nextInt();

        for (int i = 0; i < countOfBook; i++) {
            Book book = new Book();

            System.out.println("Input author of book: ");
            String authorOfBook = in.next();
            book.setAuthor(authorOfBook);

            System.out.print("Input year of book: ");
            int yearOfBook = in.nextInt();
            book.setYearPublish(yearOfBook);

            System.out.println("Input tirag of book");
            int countPageOfPage = in.nextInt();
            book.setCountPage(countPageOfPage);

            System.out.println("Input count of page: ");
            int tiragOfBook = in.nextInt();
            book.setCountTirag(tiragOfBook);


            if (tiragOfBook > 150) {
                books.add(book);
            }
        }

        System.out.println(books.toString());
    }
}

