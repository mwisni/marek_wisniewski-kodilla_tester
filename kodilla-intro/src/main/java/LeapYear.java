public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;

        System.out.println("Reszta z dzielenia wynosi: " + year % 4);

        if (leapYear(year) == 0) {
            System.out.println("Rok jest przestępny");
        } else {

            System.out.println("Rok nie jest przestępny");
        }

    }

    private static int leapYear(int a) {
       int result = a % 4;
        return  result;

    }
}