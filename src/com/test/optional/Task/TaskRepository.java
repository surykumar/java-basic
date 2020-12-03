package com.test.optional.Task;

import com.test.optional.Task.domain.Task;
import com.test.optional.Task.domain.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class TaskRepository {
    private final Map<String, Task> db = new HashMap<>();

    void loadData() {
        db.put("1", new Task("1", "hello java 1"));
        User user2 = new User("Surya", "Zemoso Hyd");
        db.put("2", new Task("2", "Jenkine Pipeline tutorial", user2, LocalDate.of(2020,12,2)));
        db.put("3", new Task("3", "hello java 3"));
        User user3 = new User("Surya", "Zemoso Hyd");
        db.put("4", new Task("4", "Docker", user3, LocalDate.of(2020,12,5)));
        db.put("5", new Task("5", "hello java 5"));
    }

    Optional<Task> find(String id) {
        // Open close principle
        if(id == null) {
            return Optional.empty();
        } else {
            return Optional.ofNullable(db.get(id));
        }
    }
    void add(Task task) {
        db.put(task.getId(), task);
    }
}
