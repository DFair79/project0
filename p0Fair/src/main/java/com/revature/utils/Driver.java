package com.revature.utils;

import io.javalin.Javalin;

public class Driver {
    public static void main(String[] args) {
        JavalinAppConfig app = new JavalinAppConfig();

        app.start(7070);
    }
}
