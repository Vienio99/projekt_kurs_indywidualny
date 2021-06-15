package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Person("John", "Travolta",
                "Male", 1954, 2, 18);
        people[1] = new Person("Robert", "De Niro",
                "Male", 1943, 8, 17);

        for (Person p : people)
        {
            System.out.println("Full name: " + p.getName()
                    + "\nAge: " + p.getAge() + "\nGender: "
                    + p.getGender() + "\n");
        }
    }
}
