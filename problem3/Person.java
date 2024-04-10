package problem3;

public class Person {
    private String name;
    private int birthdayYear;

    public void Person(String givenName, int yearOfBirth) {
        name = givenName;
        birthdayYear = yearOfBirth;
    }
    public String getName() {
        return name;
    }
    public void changeName(String n) {
        name = n;
    }
    public int getAgeInYears(int currentYear) {
        return birthdayYear - currentYear;
    }

}
