public class HelloWorld {

    public static void main(String[] args){
        String name = "Marek";
        String surname = "Wiśniewski";
        int age = 28;


        System.out.println("Hello World");
        System.out.println("Imię: " + name);
        System.out.println("Wiek: " + age + " lat");
        System.out.println("Pierwsza litera nazwiska to: " + surname.substring(0,1));
    }
}
