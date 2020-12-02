package stream.homework;

public class TaskManager {

    public static void main(String[] args) {
        TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().isBefore(TaskRepository.deadlineDate()))                 .map(TaskManager::getName)
                .forEach(tn -> System.out.println(tn));

        System.out.println(TaskRepository.dateNow());
        System.out.println(TaskRepository.deadlineDate());

    }

    public static String getName (Task task){
        return task.getName();
    }

}
