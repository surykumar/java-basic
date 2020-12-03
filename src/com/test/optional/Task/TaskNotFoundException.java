package com.test.optional.Task;

class TaskNotFoundException extends RuntimeException {
    TaskNotFoundException(String id) {
        super("No task found for id: " + id);
    }
}
