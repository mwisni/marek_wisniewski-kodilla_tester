package pl.kodilla.zadanie2_5;

public class User {

    private String name;
    private int age;

    public static void main(String[] args) {

        User marek = new User("Marek", 100);
        User anita = new User("Anita", 27);
        User marcin = new User("Marcin", 23);

        User [] users = new User[] {marek, anita, marcin};
        double resultAvrAge = User.avrAge(users);

        System.out.println(resultAvrAge);
        for (User user: users){
            if (user.age < resultAvrAge){
                System.out.println(user.name);
            }
        }

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static double avrAge (User [] User) {
        double result = 0;
        for (int i = 0; i < User.length; i++) {
            result = result + User[i].age;
        }
        return result / User.length;
    }

}




