package stream.homework;

import stream.UsersRepository;

public class ForumStats {

    public static void main(String[] args) {

        Double avgPostsUpper = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPost() )
                .average()
                .getAsDouble();
        System.out.println(avgPostsUpper);

        Double avgPostsUnder = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avgPostsUnder);


    }
}
