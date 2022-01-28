package ru.lookBag;

public class Main {

    public static void main(String[] args) {

    Author Tolstoy = new Author("Лев", "Толстой");
    Author Dostoevsky = new Author("Федор", "Достоевский");
    Author Gogol = new Author("Николай","Гоголь");

    Book WarAndPies = new Book("1890", "Война и мир", Tolstoy);
    Book AnnaKarenina = new Book("1878", "Анна Каренина",Tolstoy);
    Book CaucasianCaptive = new Book("1875","Кавказская пленица",Tolstoy);
    Book CrimeAndPunishment = new Book("1866", "Преступление и наказание", Dostoevsky);
    Book Idiot = new Book("1869","Идиот", Dostoevsky);
    Book Demons = new Book("1871","Бесы", Dostoevsky);
    Book Auditor = new Book("1836","Ревизор",Gogol);
    Book Viy = new Book("1835","Вий",Gogol);

    System.out.println("Год до изменения: " + WarAndPies.getYearPublication());
    WarAndPies.setYearPublication("1985");
    System.out.println("Год после изменения: " + WarAndPies.getYearPublication());
    System.out.println();

    Book[] classicLibrary = {WarAndPies, AnnaKarenina, CaucasianCaptive, CrimeAndPunishment, Idiot, Demons, Auditor, Viy};
    Library Library = new Library(classicLibrary);
    Library.readLibrary();
    System.out.println();

    Library.printNameBook("Преступление и наказание");
    Library.changeYearPublicationByNameBook("Преступление и наказание","1888");
    Library.printNameBook("Преступление и наказание");
    }
}