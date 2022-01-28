package ru.lookBag;

public class Library {
    private Book[] Library;

    public Library(Book[] library){
        this.Library = library;
    }

    public void readLibrary () {
        System.out.println("В библиотеке " + Library.length + " книг.");
        System.out.println("№  Автор книги | Название книги | Год публикации");
        for (int i = 0; i < Library.length; i++) {
            System.out.print((i + 1) + ": ");
            System.out.println(Library[i]);
        }
    }

    public void printNameBook(String publisherName){
        for (int i = 0; i < Library.length; i++) {
            if (Library[i].getPublisherName().equals(publisherName)) {
                System.out.println(Library[i]);
            }
        }
    }

    public void changeYearPublicationByNameBook(String publisherName, String yearPublication){
        for (int i = 0; i < Library.length; i++) {
            if (Library[i].getPublisherName().equals(publisherName)) {
                Library[i].setYearPublication(yearPublication);
                System.out.println("Год публикации книги \"" + Library[i].getYearPublication() + "\" был изменен на " + yearPublication);
                break;
            }
        }
    }
}
