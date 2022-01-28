package ru.lookBag;

import java.util.Objects;

public class Book {
    String yearPublication;
    String publisherName;
    Author authorName;

    public Book(String yearPublication, String publisherName, Author authorName){
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.yearPublication = yearPublication;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getYearPublication() {
        return yearPublication;
    }


    public void setYearPublication(String yearPublication) {
        this.yearPublication = yearPublication;
    }

}

