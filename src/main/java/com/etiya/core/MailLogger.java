package com.etiya.core;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Mail has been sent :" + data);
    }
}
