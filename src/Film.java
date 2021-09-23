import java.text.DecimalFormat;
import java.time.LocalDateTime;


public class Film {
    private String namefilm;
    private LocalDateTime dateandtime;
    private double timeDuration;
    private String genre;
    private double budget;

    public Film(String namefilm, LocalDateTime dateandtime, double timeDuration, String genre, double budget) {
        this.namefilm = namefilm;
        this.dateandtime = dateandtime;
        this.timeDuration = timeDuration;
        this.genre = genre;
        this.budget = budget;
    }

    public Film(){}
    public String getNamefilm() {
        return namefilm;
    }
    public void setNamefilm(String nameFilm) {
        this.namefilm = namefilm;
    }

    public LocalDateTime getDateandtime() {
        return dateandtime;
    }

    public void setDateandtime(LocalDateTime dateandtime) {
        this.dateandtime = dateandtime;
    }

    public double getTimeDuration() {
        return timeDuration;
    }

    public double gettimeDuraction() {
        return timeDuration;
    }
    public void setTimeDuration(double timeDuration) {
        DecimalFormat df = new DecimalFormat("#0.0");
        String s = df.format(timeDuration);
        this.timeDuration = s.contains(".6") ? Math.ceil(timeDuration) : timeDuration;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nameFilm='" + namefilm + '\'' +
                ", dateandtime=" + dateandtime +
                ", timeduraction=" + timeDuration +
                ", genre=" + genre +
                ", budget=" + budget +
                '}';
    }

}
