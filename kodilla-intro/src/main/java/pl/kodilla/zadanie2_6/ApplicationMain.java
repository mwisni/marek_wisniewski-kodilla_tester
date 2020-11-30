package pl.kodilla.zadanie2_6;

public class ApplicationMain {

    public static void main(String[] args) {
        String name = "Adam";
        double age = 31;
        double height = 140;

        Application application = new Application();
        System.out.println(application.checkAgeAndHeight(name, age,height));
    }
}
