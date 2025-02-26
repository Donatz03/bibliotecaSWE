package library.models;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String indirizzo;
    private String telefono;
    private Catalogo catalogo;
    private ArrayList<Utente> utenti;
    private ArrayList<Prestito> prestiti;

    public Biblioteca(String nome, String indirizzo, String telefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.catalogo = new Catalogo();
        this.utenti = new ArrayList<Utente>();
        this.prestiti = new ArrayList<Prestito>();
    }

    public void aggiungiUtente(Utente utente) {
        utenti.add(utente);
    }

    public void rimuoviUtente(Utente utente) {
        utenti.remove(utente);
    }

    public ArrayList<Utente> getUtenti() {
        return utenti;
    }

    public void aggiungiPrestito(Prestito prestito, Utente utente) {
        prestiti.add(prestito);
        utente.aggiungiPrestito(prestito);
    }

    public void rimuoviPrestito(Prestito prestito) {
        prestiti.remove(prestito);
    }

    public ArrayList<Prestito> getPrestiti() {
        return prestiti;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void concludiPrestito(Prestito prestito, boolean danneggiato) {
        if(danneggiato && prestito.getLibro().getStato() < 4){
            prestito.getLibro().setStato(prestito.getLibro().getStato() + 1);
        }
        if(prestito.getLibro().getStato() == 4){
            prestito.restituito();
            catalogo.rimuoviLibro(prestito.getLibro());
        }
        prestito.restituito();
    }
}
