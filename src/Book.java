public class Book {
    private String author;
    private int countPage;
    private int countTirag;
    private int yearPublish;

    public Book(String author, int countPage, int countTirag, int yearPublish) {
        this.author = author;
        this.countPage = countPage;
        this.countTirag = countTirag;
        this.yearPublish = yearPublish;
    }

    public Book(){}
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public int getCountTirag() {
        return countTirag;
    }

    public void setCountTirag(int countTirag) {
        this.countTirag = countTirag;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", countPage=" + countPage +
                ", countTirag=" + countTirag +
                ", yearPublish=" + yearPublish +
                '}';
    }
}
