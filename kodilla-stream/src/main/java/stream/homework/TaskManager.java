package stream.homework;

import java.time.LocalDate;

public class TaskManager {
            public static void main(String[] args) {
                TaskRepository.getTasks()
                        .stream()
                        .filter(task -> task.getDeadline().isAfter(LocalDate.now()))
                        .map(Task::getDeadline)
                        .forEach(System.out::println);

            }

}
