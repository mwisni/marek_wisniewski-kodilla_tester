package pl.kodilla.cwiczenie_Switch;

import java.util.Scanner;

public class Color {
    public static void main(String[] args) {

        System.out.println(getFirstLetterOfColor());
    }

        public static String getFirstLetterOfColor (){

            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("Select Color: (B - Blue, W-White, G-Green)");
                String color = scanner.nextLine().trim().toUpperCase();
                switch (color){
                    case "B": return "Blue";
                    case "W": return "White";
                    case "G": return "Green";
                    default:
                        System.out.println("Wrong choice, pleas try again.");
                }
            }
        }

}
