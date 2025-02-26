package library;
import java.util.ArrayList;
import library.models.Catalogo;
import library.models.Libro;

public class App{
    public static void main(String[] args) {
        //crea 4 libri
        Libro libro1 = new Libro(1, "Il signore degli anelli", "J.R.R. Tolkien", "Fantasy", "Bompiani", 1954, 20.0f);
        Libro libro2 = new Libro(2, "Il vecchio e il mare", "Ernest Hemingway", "Romanzo", "Mondadori", 1952, 15.0f);       
        Libro libro3 = new Libro(3, "Il nome della rosa", "Umberto Eco", "Giallo", "Bompiani", 1954, 18.0f);
        Libro libro4 = new Libro(4, "Il ritratto di Dorian Gray", "Oscar Wilde", "Romanzo", "Mondadori", 1890, 12.0f);

        //crea un catalogo
        Catalogo catalogo = new Catalogo();
        catalogo.aggiungiLibro(libro1);
        catalogo.aggiungiLibro(libro2);
        catalogo.aggiungiLibro(libro3);
        catalogo.aggiungiLibro(libro4);

        //cerca un libro
        ArrayList<Libro> risultati = catalogo.ricercaLibro("romanzo");
        System.out.println(risultati);
    }
}
