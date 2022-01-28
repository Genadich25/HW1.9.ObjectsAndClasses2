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
        Library Library = new Library(classicLibrary);
        Library.readLibrary();
        System.out.println();

        Library.printNameBook("Преступление и наказание");
        Library.changeYearPublicationByNameBook("Преступление и наказание","1888");
        Library.printNameBook("Преступление и наказание");
        System.out.println();

        System.out.println("Проверяем работу методов в классе \"Author\" ");
        Author copyTolstoy = new Author("Лев", "Толстой");
        System.out.println("==============================");
        System.out.println("Проверка книг на равенство: " + tolstoy.equals(copyTolstoy));
        System.out.println("Проверка книг на равенство хэшей: " + (tolstoy.hashCode() == copyTolstoy.hashCode()));
        System.out.println("Проверка разных книг на равенство: " + tolstoy.equals(gogol));
        System.out.println("Проверка разных книг на равенство хэшей: " + (tolstoy.hashCode() == gogol.hashCode()));
        System.out.println(tolstoy);
        System.out.println(gogol);
        System.out.println("==============================");
        System.out.println();

        System.out.println("Проверяем работу методов в классе \"Book\" ");
        Book copyWarAndPies = new Book("1985", "Война и мир", tolstoy);
        System.out.println("==============================");
        System.out.println("Проверка книг на равенство: " + WarAndPies.equals(copyWarAndPies));
        System.out.println("Проверка книг на равенство хэшей: " + (WarAndPies.hashCode() == copyWarAndPies.hashCode()));
        System.out.println("Проверка разных книг на равенство: " + WarAndPies.equals(Idiot));
        System.out.println("Проверка разных книг на равенство хэшей: " + (WarAndPies.hashCode() == Idiot.hashCode()));
        System.out.println(WarAndPies);
        System.out.println(Idiot);
        System.out.println("==============================");
    }
}