package sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {


        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Cars", 2.5, 2.5, true));
        stamps.add(new Stamp("Cars", 3, 2.5, true));
        stamps.add(new Stamp("Dogs", 3, 3, false));
        stamps.add(new Stamp("Cars", 2.5, 2.5, false));
        stamps.add(new Stamp("Animal", 2.5, 5, true));
        stamps.add(new Stamp("Animal", 2.5, 5, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

    }
}
