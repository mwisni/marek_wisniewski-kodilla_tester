package pl.kodilla.zadanie2_6;

public class Application {

    public boolean checkAgeAndHeight (String name, double age, double height){

        boolean status;

        if (age > 30 && height > 160){
            System.out.println(name + " is older than 30 and higher then 160cm");
            return true;
        }else {
            System.out.println(name + " is exactly 30 or younger than 30 or he is exactly 160cm or shorter than 160cm");
        }
        return true ;
    }

}
