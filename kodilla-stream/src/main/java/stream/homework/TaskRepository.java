package stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("eat breakfast", LocalDate.now(), LocalDate.of(2020, 12, 28)));
        taskList.add(new Task("meet friends", LocalDate.now(), LocalDate.of(2020,12,25)));
        taskList.add(new Task("send email", LocalDate.now(), LocalDate.of(2020,12, 3)));
        return taskList;

    }

}
