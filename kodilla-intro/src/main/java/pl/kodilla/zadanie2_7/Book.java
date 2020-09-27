package pl.kodilla.zadanie2_7;

public class Book {


    private  String author;
    private  String title;
// Konstruktor Book, z argumentami Autor i Tytuł
    private Book(String author, String title){
        this.author = author;
        this.title = title;
    }

// Metoda Zwracająca argumenty Książki (autor i tytuł)
    public static Book of(String author, String title){
        Book bookAtribut = new Book(author, title);

        return bookAtribut;
    }
// Metoda toString, konwertuje wartości do Stringa
    public String toString (){
        return "Autor: " + this.author + " Tytuł: " + this.title;
    }


}
