import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
            throws ParseException {
        Scanner num = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter the job number :1) easy level 2) average level. If you want to exit output 0.");
            number = num.nextInt();
            switch (number) {
                case 0:
                    break;
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                default:
                    System.out.println("You entered the wrong number(Enter 1-2). ");
                    break;
            }
        } while (number != 0);

    }

    public static void task1() {
        List<Book> books = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Input count of book: ");
        int countOfBook = in.nextInt();

        for (int i = 0; i < countOfBook; i++) {
            Book book = new Book();

            System.out.println("Enter the author of book: ");
            String authorOfBook = in.next();
            book.setAuthor(authorOfBook);

            System.out.println("Enter the year of book: ");
            int yearOfBook = in.nextInt();
            book.setYearPublish(yearOfBook);

            System.out.println("Enter the circulation of book");
            int countPageOfPage = in.nextInt();
            book.setCountPage(countPageOfPage);

            System.out.println("Enter the count of page: ");
            int tiragOfBook = in.nextInt();
            book.setCountTirag(tiragOfBook);

            if (tiragOfBook > 150) {
                books.add(book);
            }
        }

        System.out.println(books.toString());
    }

    public static void task2()
    {
//            throws ParseException {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        ZoneId zid = ZoneId.of("Europe/Amsterdam");

        List<Film> films = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Input count of film: ");
        int countOfFilm = in.nextInt();

        for (int i = 0; i < countOfFilm; i++) {
            Film film = new Film();

            System.out.println("Enter the title of the movie: ");
            String nameoffilm = in.next();
            film.setNamefilm(nameoffilm);

//            System.out.print("Enter the date and time of the session: ");
            while (true) {
                System.out.print("Enter the date and time (dd/MM/yyyy date format && hh:mm time format): ");
                String scannedDate = in.nextLine();

                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                    LocalDateTime dateandtime = LocalDateTime.parse(scannedDate, formatter);
                    film.setDateandtime(dateandtime);
                    break;
                } catch (Exception ignored) {
                }
            }
//            String dateandtime = in.next();
//            film.setDateandtime(LocalDateTime.parse(dateandtime, dtf));

            System.out.println("Enter genre: ");
            String genre = in.next();
            film.setGenre(genre);
            System.out.println("Enter session duration: ");
            double timeDuration = in.nextDouble();
            film.setTimeDuration(timeDuration);

            System.out.println("Enter budget:");
            double budget = in.nextDouble();
            film.setBudget(budget);
            films.add(film);
        }

        //  StringBuilder answer = new StringBuilder();

        for (Film film : films) {

            if (film.gettimeDuraction() > 1.4 && film.getDateandtime().getHour() >= 18 && film.getDateandtime().getMinute() > 0) {
//                String date = String.format("%d/%s/%d %d:%d",film.getDateandtime().getDay(), film.getDateandtime().getMonth(), film.getDateandtime().getYear()
//                        , film.getDateandtime().getHours(), film.getDateandtime().getMinutes());
//                answer.append(String.format("\n\n[RESULT]\nName: %s\nSession Date: %s\nDuration: %.1f\nGenres (-s): %s\nBudget: %.1f $\n", date, film.gettimeDuraction(), film.getGenre(), film.getBudget()));

                String data = film.getNamefilm() + " " + film.getDateandtime().getDayOfMonth() + " " + film.getDateandtime().getMonth() + " " + film.getDateandtime().getYear() + " " +
                        film.getDateandtime().getHour() + " " + film.getDateandtime().getMinute();
                System.out.println(data);
            }
        }

    }


}


