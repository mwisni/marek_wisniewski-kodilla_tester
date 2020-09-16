public class Application {
    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        Application application = new Application();


        System.out.println(application.checkAgeAndHeight(age,height));
    }


    public boolean checkAgeAndHeight (double age, double height){

        if (age > 30 && height > 160){
            System.out.println("User is older than 30 and higher then 160cm");
        }else {
            System.out.println("User is older than 30 and higher then 160cm");
        }

        return true ;
    }



}
