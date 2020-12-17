/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdmanager.controllers;

import com.mycompany.dvdmanager.data.DvDDao;
import com.mycompany.dvdmanager.models.DvD;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nacer
 */
@RestController
@RequestMapping("")
public class DvDController {
    private final DvDDao dao;
    
    public DvDController(DvDDao dao){
        this.dao = dao;
    }
 
    // get DVD by ID
    @GetMapping("/dvd/{id}")
    public ResponseEntity<DvD> findById(@PathVariable int id) {
        DvD result = dao.findById(id);
        if (result == null) {
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
    
    // Get all DVD
    @GetMapping("/dvds")
    public List<DvD> all() {
        return dao.getAll();
    }
    
    // Get dvd by title
    @GetMapping("/dvds/{title}")
    public ResponseEntity<DvD> findByTitle(@PathVariable String title) {
        DvD result = dao.findByTitle(title);
        if (result == null) {
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
    
    // get dvd by release year

    
    // get dvd by director name
    
    
    // get dvd by rating

    
    // create a dvd

    
    // update a dvd

    
    // delete a dvd by id

    
}
