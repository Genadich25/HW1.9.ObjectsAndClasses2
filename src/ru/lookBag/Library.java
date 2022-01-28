package ru.lookBag;

public class Library {
    private final Book[] library;

    public Library(Book[] Library){
        this.library = Library;
    }

    public void readLibrary () {
        System.out.println("В библиотеке " + library.length + " книг.");
        System.out.println("№  Автор книги | Название книги | Год публикации");
        for (int i = 0; i < library.length; i++) {
            System.out.print((i + 1) + ": ");
            System.out.println(library[i].toString());
        }
    }

    public void printNameBook(String publisherName){
        for (int i = 0; i < library.length; i++) {
            if (library[i].getPublisherName().equals(publisherName)) {
                System.out.println(library[i]);
            }
        }
    }

    public void changeYearPublicationByNameBook(String publisherName, String yearPublication){
        for (int i = 0; i < library.length; i++) {
            if (library[i].getPublisherName().equals(publisherName)) {
                library[i].setYearPublication(yearPublication);
                System.out.println("Год публикации книги \"" + library[i].getYearPublication() + "\" был изменен на " + yearPublication);
                break;
            }
            if(i == library.length - 1){
                System.out.println("Книги " + publisherName + " в библиотеке нет!");
            }
        }
    }
}
