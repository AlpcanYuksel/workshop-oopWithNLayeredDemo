package com.etiya.core;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Logged to the database :" + data);
    }
}
