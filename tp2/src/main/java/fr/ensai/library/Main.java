package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        Magazine LesEchos = new Magazine("Les Echos", 2025, 50, "978-0-618-24525-6", "2007");

        Magazine LeMonde = new Magazine("Le Monde", 2025, 25, "978-0-718-24525-6", "10258");

        // Créer une instance de la bibliothèque
        Library mLibrary = new Library("Bibliothèque des champs libres");

        mLibrary.addItem(LeMonde);
        mLibrary.addItem(LesEchos);

        mLibrary.displayitems();

        // Charger les livres à partir du fichier items.csv
        mLibrary.loadItemsFromCSV("books.csv");

        // Afficher tous les livres

        System.out.println(fellowshipOfTheRing.toString());
    }
}