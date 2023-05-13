package com.example.barber_project.Contollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Vistas {
    
    public List database = new ArrayList<>();
    
    @GetMapping("/")
    public List index(){
        return this.database;
    }

    @GetMapping("/find/{id}")
    public String find(@PathVariable int id){
        return "Find" + id;
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable int id){
        return "Update" + id;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return "Delete" + id;
    }

    @PostMapping("/save")
    public String save(){
        return "Save";
    }
}