package com.mykh.threadproject.runner;

import com.mykh.threadproject.service.ThreadService;

public class Runner {
    public static void main(String[] args) {
        ThreadService threadService = new ThreadService();
        threadService.start();
    }
}
