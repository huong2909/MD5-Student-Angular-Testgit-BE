package com.example.demo.controller;

import com.example.demo.model.Clazz;
import com.example.demo.model.Student;
import com.example.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/classes")
public class ClassController {
    @Autowired
    ClassService classService;

    @GetMapping
    public ResponseEntity<Iterable<Clazz>> findAll() {
        return new ResponseEntity<>(classService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity add(@RequestBody Clazz clazz) {
        classService.save(clazz);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Clazz> findById(@PathVariable Long id) {

        return new ResponseEntity<>(classService.findById(id).get(),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Clazz> edit(@RequestBody Clazz clazz, @PathVariable Long id) {
        clazz.setId(id);
        classService.save(clazz);
        return new ResponseEntity<>(classService.findById(id).get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        classService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
