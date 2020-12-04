package stream.homework;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class TaskManager {
            public static void main(String[] args) {
                TaskRepository.getTasks()
                        .stream()
                        .filter(task -> task.getDeadline().isAfter(LocalDate.now()))
                        .map(Task -> Task.getDeadline())
                        .collect(Collectors.toList())
                        .forEach(System.out::println);


            }
}
