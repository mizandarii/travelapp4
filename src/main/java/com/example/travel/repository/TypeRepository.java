package com.example.travel.repository;

import com.example.travel.model.Type;

import java.util.List;

public interface TypeRepository {
    List<Type> findAll();
}
