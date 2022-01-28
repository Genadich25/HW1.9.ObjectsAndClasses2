package ru.lookBag;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String secondName;
    private final String fullName;

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

    @Override
    public String toString(){
        return firstName + " " + secondName;
    }

    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Author author = (Author) obj;
        return fullName.equals(author.fullName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(fullName);
    }
}
