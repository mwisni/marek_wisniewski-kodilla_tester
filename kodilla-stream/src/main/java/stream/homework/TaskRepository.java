package stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("eat breakfast", dateNow(), deadlineDate() ));
        taskList.add(new Task("meet friends", dateNow(), deadlineDate() ));
        taskList.add(new Task("send email", dateNow(), deadlineDate() ));
        return taskList;

    }

    public static LocalDate localDateMorning(){
        return LocalDate.of(2020, 12, 02);
    }

    public static LocalDate dateNow(){
        return LocalDate.now();
    }

    public static LocalDate deadlineDate(){
        return LocalDate.of(2020, 12, 28);
    }
}
