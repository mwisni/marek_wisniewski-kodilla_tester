package pl.kodilla.zadanie2_7;

public class BookAtribut {


    private  String author;
    private  String title;
// Konstruktor Book, z argumentami Autor i Tytuł
    private BookAtribut(String author, String title){
        this.author = author;
        this.title = title;
    }

// Metoda Zwracająca argumenty Książki (autor i tytuł)
    public static BookAtribut of(String author, String title){
        BookAtribut bookAtribut = new BookAtribut(author, title);

        return bookAtribut;
    }
// Metoda toString, konwertuje wartości do Stringa
    public String toString (){
        return "Autor: " + this.author + " Tytuł: " + this.title;
    }


}
