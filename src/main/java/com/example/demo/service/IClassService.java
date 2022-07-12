package com.example.demo.service;

import com.example.demo.model.Clazz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IClassService extends IService<Clazz>{
    Iterable<Clazz> findAll();
    Optional<Clazz> findById(Long id);

}