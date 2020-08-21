public class LeapYear {
    public static void main(String[] args) {

        int year = 2021;

        if (leapYear(year)){
            System.out.println("Rok jest przestępny");
        }else {
            System.out.println("Rok nie jest przestępny");
        }
    }
    private static boolean leapYear(int a) {
        return ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0);
    }
}
