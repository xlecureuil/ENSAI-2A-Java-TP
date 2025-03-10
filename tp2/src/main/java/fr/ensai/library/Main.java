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

        // Créer une instance de la bibliothèque
        Library mLibrary = new Library("Bibliothèque des champs libres");

        // Charger les livres à partir du fichier books.csv
        mLibrary.loadBooksFromCSV("books.csv");

        // Afficher tous les livres

        System.out.println(fellowshipOfTheRing.toString());
    }
}