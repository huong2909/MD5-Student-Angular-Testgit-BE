package com.example.demo.service;


import com.example.demo.model.Clazz;
import com.example.demo.repository.ClazzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassService implements IClassService {

    @Autowired
    private ClazzRepository clazzRepository;


    @Override
    public void save(Clazz clazz) {
        clazzRepository.save(clazz);
    }

    @Override
    public Iterable<Clazz> findAll() {
        return clazzRepository.findAll();
    }

    @Override
    public Optional<Clazz> findById(Long id) {
        return clazzRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        clazzRepository.deleteById(id);
    }

    @Override
    public Page<Clazz> findAllByNameContaining(Pageable pageable, String name) {
        return null;
    }


}