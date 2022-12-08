import java.util.Objects;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
        if (name == null || name.isEmpty() || name.isBlank()) {
            name = "Информация не указана";
        }
        this.name = name;
        if (town == null || town.isEmpty() || town.isBlank()) {
            town = "Информация не указана";
        }
        this.town = town;
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            jobTitle = "Информация не указана";
        }
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " +
                name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
