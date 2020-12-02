package com.test.optional.Task.domain;

import java.util.Optional;

public class User {

    private final String username;
    private final String address;

    public User(String username) {
        this(username, null);
    }

    public User(String username, String address) {
        this.username = username;
        this.address =address;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }
}

