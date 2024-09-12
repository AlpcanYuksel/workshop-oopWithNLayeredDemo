package com.etiya.core;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Logged to the file: " + data);
    }
}
