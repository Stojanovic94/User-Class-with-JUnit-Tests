package user;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> favoriteActivities;

    // Konstruktor
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteActivities = new ArrayList<>();
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFavoriteActivities() {
        return favoriteActivities;
    }

    // Metoda za punoletnost
    public boolean isAdult() {
        return age >= 18;
    }

    // Metoda za puno ime
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Dodaj aktivnost
    public void addFavoriteActivity(String activity) {
        favoriteActivities.add(activity);
    }
}
