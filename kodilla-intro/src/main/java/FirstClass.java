public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 300, 2000);
        System.out.println("Weight: " + notebook.weight + "g Price: " + notebook.price + " Year: " + notebook.year);
        /* Komentuję ten kawałek ponieważ nie wiem czy ta metoda powinna się wyświetlać skoro w
           kolejnej porównujemy cenę i rok produkcji
           notebook.CheckPrice();
        */
        notebook.CheckNotebook();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2011);
        System.out.println(" Weight: " + heavyNotebook.weight + "g Price: " + heavyNotebook.price + " Year: " + heavyNotebook.year);
      /* Komentuję ten kawałek ponieważ nie wiem czy ta metoda powinna się wyświetlać skoro w
         kolejnej porównujemy cenę i rok produkcji
         heavyNotebook.CheckPrice();
      */
        heavyNotebook.CheckNotebook();

        Notebook oldNotebook = new Notebook(2000, 750, 2020);
        System.out.println(" Weight: " + oldNotebook.weight + "g Price: " + oldNotebook.price + " Year: " + oldNotebook.year);
       /* Komentuję ten kawałek ponieważ nie wiem czy ta metoda powinna się wyświetlać skoro w
          kolejnej porównujemy cenę i rok produkcji
          oldNotebook.CheckPrice();
       */
        oldNotebook.CheckNotebook();

    }
}
