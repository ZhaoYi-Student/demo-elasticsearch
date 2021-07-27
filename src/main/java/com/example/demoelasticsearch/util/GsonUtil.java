package com.example.demoelasticsearch.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class GsonUtil {

    public static final Gson GSON = new Gson();

    public static <T> String toJson(T entity) {
        return GSON.toJson(entity);
    }

    public static <T> T fromJson(Class<T> clazz, String json) {
        return GSON.fromJson(json, clazz);
    }

    public static <T> List<T> fromJson(String json){
        return GSON.fromJson(json,new TypeToken<T>(){}.getType());
    }

}
