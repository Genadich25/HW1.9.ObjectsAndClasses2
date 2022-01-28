package ru.lookBag;

import java.util.Objects;

public class Author {
    String firstName;
    String secondName;
    String fullName;

    public Author(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fullName = firstName + " " + secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public String getFullName() {
        return fullName;
    }

}
