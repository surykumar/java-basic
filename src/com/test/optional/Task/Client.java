package com.test.optional.Task;

import com.test.optional.Task.domain.Task;

import java.util.Optional;

public class Client {
    private static String getMyDefault() {
        System.out.println(">>>>>>>>Getting Default Value function called<<<<<<<<<");
        return "Default Value text";
    }
    public static void main(String[] args) {

        //Initialize & load data to task Repo
        TaskRepository taskRepository = new TaskRepository();
        taskRepository.loadData();
        TaskService taskService = new TaskService(taskRepository);

        System.out.println("\n\n\n*************************isPresent************************************\n");
        System.out.println(taskService.taskIsPresent("11"));
        System.out.println(taskService.taskIsPresent("2"));

        System.out.println("\n\n\n***********************FlatMap & orElse example**************************************\n");
        // Used: FlatMap & orElse example
        System.out.println("TASK ASSIGNED: " + taskService.taskAssignedTo("2"));
        System.out.println("TASK NOT ASSIGNED: " + taskService.taskAssignedTo("3"));

        System.out.println("\n\n\n***********************Map & orElseThrow**************************************\n");
        //Used: Map & orElseThrow
        System.out.println("TASK TITLE: " + taskService.taskTitle("5"));
        try {
            System.out.println("TASK TITLE orElseThrow Exception: " + taskService.taskTitle("50"));
        }
        catch (TaskNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n*************************flatMap, Filter, ifPresentOrElse************************************\n");

        // Used flatMap, Filter, ifPresentOrElse
        taskService.taskDueDateStatus("2");
        taskService.taskDueDateStatus("5");

        System.out.println("\n\n\n*************************orElseThrow if Task not exist************************************\n");
        try {
            System.out.println(taskService.getTask("22"));
        }
        catch (TaskNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n*************************orElseGet createTask if not exist************************************\n");
        Task task = taskService.createIfNotExist("22");
        System.out.println("Task Title: " + taskService.taskTitle("22"));


        System.out.println("\n\n\n************************* Difference between orElse & orElseGett************************************\n");
        // Difference between orElse & orElseGet
        // Case:1 when text is null
        String text = null;
        String nullInputWithOrElseGet = Optional.ofNullable(text).orElseGet(Client::getMyDefault);
        System.out.println("Output for null text with orElseGet: " + nullInputWithOrElseGet);
        String nullInputWithOrElse = Optional.ofNullable(text).orElse(getMyDefault());
        System.out.println("Output for null text with orElse: " + nullInputWithOrElse);

        // Observation: when the wrapped value is not present, then both orElse() and orElseGet() work exactly the same way

        // Case:2 when text is not null
        text = "Text present";
        String textInputWithOrElseGet = Optional.of(text).orElseGet(Client::getMyDefault);
        System.out.println("Output for wrapped text with orElseGet: " + textInputWithOrElseGet);
        String textInputWithOrElse = Optional.of(text).orElse(getMyDefault());
        System.out.println("Output for wrapped text with orElse: " + textInputWithOrElse);
        // So in this case, we have just created one redundant object that is never used. However,
        // when a method such as getMyDefault() has to make a web service call or even query a
        // database, the cost becomes very obvious.


        // Map Explained:
        String name = "TestString";
        Optional<String> nameOptional = Optional.of(name);
        int len = nameOptional
                .map(String::length).orElse(0);
        System.out.println(len);

        System.out.println("\n\n\n************************* Difference between map & flatMap************************************\n");
        // Difference between map & flatMap: map transforms values only when they are unwrapped whereas flatMap takes a
        // wrapped value and unwraps it before transforming it.
        System.out.println("Tasked assigned To with map: " + taskService.taskAssignedToWithMap("2"));
        System.out.println("Tasked assigned To with flatMap: " + taskService.taskAssignedTo("2"));

    }
}
