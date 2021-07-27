package com.example.demoelasticsearch.elastic.service;

import com.example.demoelasticsearch.pojo.Commodity;

import java.util.List;

public interface CommonService<T> {

    T findById(String id);

    List<T> findAll();

    int save(T target);

    int saveAll(List<T> targets);

    int update(T target);

    int updateAll(List<T> targets);

    int del(T target);

    int delAll(List<T> target);
}
