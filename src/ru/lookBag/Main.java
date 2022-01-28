package ru.lookBag;

public class Main {

    public static void main(String[] args) {

    Author tolstoy = new Author("Лев", "Толстой");
    Author dostoevsky = new Author("Федор", "Достоевский");
    Author gogol = new Author("Николай","Гоголь");

    Book WarAndPies = new Book("1890", "Война и мир", tolstoy);
    Book AnnaKarenina = new Book("1878", "Анна Каренина",tolstoy);
    Book CaucasianCaptive = new Book("1875","Кавказская пленица",tolstoy);
    Book CrimeAndPunishment = new Book("1866", "Преступление и наказание", dostoevsky);
    Book Idiot = new Book("1869","Идиот", dostoevsky);
    Book Demons = new Book("1871","Бесы", dostoevsky);
    Book Auditor = new Book("1836","Ревизор",gogol);
    Book Viy = new Book("1835","Вий",gogol);

    System.out.println("Год до изменения: " + WarAndPies.getYearPublication());
    WarAndPies.setYearPublication("1985");
    System.out.println("Год после изменения: " + WarAndPies.getYearPublication());
    System.out.println();

    Book[] classicLibrary = {WarAndPies, AnnaKarenina, CaucasianCaptive, CrimeAndPunishment, Idiot, Demons, Auditor, Viy};
    Library library = new Library(classicLibrary);
    library.readLibrary();
    System.out.println();

    library.printNameBook("Преступление и наказание");
    library.changeYearPublicationByNameBook("Преступление и наказание","1888");
    library.printNameBook("Преступление и наказание");
    }
}