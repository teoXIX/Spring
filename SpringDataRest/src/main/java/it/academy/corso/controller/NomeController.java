package it.academy.corso.controller;

import it.academy.corso.model.Student;
import it.academy.corso.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NomeController {

    @GetMapping("/myname")
    public ResponseEntity<String> getName (){

        return new ResponseEntity<>("Matteo", HttpStatus.OK);
    }

}
