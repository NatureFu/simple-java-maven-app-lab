package com.mycompany.app;

/**
 * 一个简单的 Hello World 应用
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}