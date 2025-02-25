public class Libro {
    private int isbn;
    private String titolo;
    private String autore;
    private String genere;
    private String editore;
    private int annoPubblicazione;
    private String stato;
    private float prezzo;
    private boolean disponibile;

    public Libro(int isbn, String titolo, String autore, String genere, String editore, int annoPubblicazione, float prezzo) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.editore = editore;
        this.annoPubblicazione = annoPubblicazione;
        this.stato = "Nuovo"; //a new book is in new state by default
        this.prezzo = prezzo;
        this.disponibile = true; //a new book is available by default
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    @Override
    public String toString() {
        return titolo + " " + autore + " " + editore + " " + annoPubblicazione + "\n";
    }
}
