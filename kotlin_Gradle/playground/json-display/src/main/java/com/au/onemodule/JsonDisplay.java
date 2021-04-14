package com.au.onemodule;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDisplay {

    public static String showJson(Object obj) {
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(obj);
        System.out.println(json);

        return null;
    }
}
