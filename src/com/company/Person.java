package com.company;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String firstName;
    private final String secondName;
    private final String gender;
    private final int age;

    public Person(String firstName, String secondName,
                  String gender, int year, int month, int day)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        LocalDate birthDate = LocalDate.of(year, month, day);
        this.age = Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getName()
    {
        return (firstName + " " + secondName);
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

}
