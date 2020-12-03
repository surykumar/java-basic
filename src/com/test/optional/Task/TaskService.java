package com.test.optional.Task;
import com.test.optional.Task.domain.Task;
import com.test.optional.Task.domain.User;
//https://github.com/shekhargulati/java8-the-missing-tutorial/
//https://github.com/wytten/java8-optional/blob/master/src/test/java/optional/PersonTest.java
//https://medium.com/faun/working-on-null-elegantly-with-java-optional-62f5e65869c5
import java.time.LocalDate;
import java.util.Optional;

class TaskService {
    private TaskRepository taskRepository;

    TaskService(TaskRepository taskRepository){
         this.taskRepository = taskRepository;
    }

    // orElseThrow: Method explained
    String taskTitle(String taskId) {
        return taskRepository.
                find(taskId).
                map(Task::getTitle).
                orElseThrow(() -> new TaskNotFoundException(String.format("No task exist for id '%s'",taskId)));
    }

    // orElse Method: Task Assigned to with flatMap
    String taskAssignedTo(String taskId) {
        return taskRepository.
                find(taskId).
                flatMap(task -> task.getAssignedTo().map(User::getUsername)).
                orElse("Task Not Assigned yet");
    }

    // Task assigned to with Map
    String taskAssignedToWithMap(String taskId) {
        Optional<Optional<String>> assignedOptionalWrapper = taskRepository.find(taskId).map(task -> task.getAssignedTo().map(User::getUsername));
        Optional<String> taskOptional = assignedOptionalWrapper.orElseThrow(IllegalArgumentException::new);
        return taskOptional.orElse("Task Not Assigned yet");
    }


    // orElseGet Method
    Task createIfNotExist(String taskId) {
        return taskRepository.find(taskId).orElseGet(()-> createTask(taskId));
    }

    // ifPresentOrElse Method
    void taskDueDateStatus(String taskId) {
        taskRepository.
                find(taskId).
                flatMap(Task::getDueOn).
                filter(d -> d.equals(LocalDate.now())).
                ifPresentOrElse((d)-> {
                    System.out.println("Task due date is today");
                }, ()-> { System.out.println("Task due date is not today");});
    }

    // isPresent Method
    boolean taskIsPresent(String taskId) {
        return taskRepository.find(taskId).isPresent();
    }

    private Task createTask(String taskId) {
        Task defaultTask = new Task(taskId, "Default Title");
        taskRepository.add(defaultTask);
        return getTask(taskId);
    }

    Task getTask(String taskId) {
        return taskRepository.find(taskId).orElseThrow(() -> new TaskNotFoundException(String.format("No task exist for id '%s'",taskId)));
    }
}
