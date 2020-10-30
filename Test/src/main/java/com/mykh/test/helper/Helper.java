package com.mykh.test.helper;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    private List<User> list = new ArrayList<>();

    public List<User> users() {
        list.add(new User("Dave",33));

        return list;
    }
}
