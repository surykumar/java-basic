package com.test.optional.Task.domain;

import java.time.LocalDate;
import java.util.Optional;

public class Task {
    private final String title;
    private final User assignedTo;
    private final String id;
    private final LocalDate dueOn;

    public Task(String id, String title) {
         this(id, title, null, null);
    }

    public Task(String id, String title, User assignedTo, LocalDate dueOn) {
        this.id = id;
        this.title = title;
        this.assignedTo = assignedTo;
        this.dueOn = dueOn;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Optional<User> getAssignedTo() {
        return Optional.ofNullable(assignedTo);
    }

    public Optional<LocalDate> getDueOn() {
        return Optional.ofNullable(dueOn);
    }

}