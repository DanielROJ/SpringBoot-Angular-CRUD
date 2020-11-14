package com.co.projectsa.demo.controller;

import com.co.projectsa.demo.exeption.ResourceNotFoundException;
import com.co.projectsa.demo.model.Employ;
import com.co.projectsa.demo.repository.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/employ")
public class EmployController {

    @Autowired
    private EmployRepository repEmploy;


    //get All employees
    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Employ>> getAllEmployees(){
        try {
            List<Employ> responseListEmploy = repEmploy.findAll();
            return ResponseEntity.ok(responseListEmploy);
        }catch (Exception e){
            return null;
        }
    }

    //get one employ
    @GetMapping(value = "/id/{id}")
    @ResponseBody
    public ResponseEntity<Employ> getEmploy(@PathVariable Integer id){
        Employ  responseEmploy = repEmploy.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employ not exist !!!"));
        return ResponseEntity.ok(responseEmploy);
    }

    //create an Employ
    @PostMapping(value = "/create")
    public ResponseEntity<Employ> createEmploy(@RequestBody Employ employ){
        Employ responseEmployCreated = repEmploy.save(employ);
        return ResponseEntity.ok(responseEmployCreated);
    }


    //Delete an Employ
    @DeleteMapping(value = "/delete/{id}")
    public  ResponseEntity<Map<String,Boolean>> deleteEmploy(@PathVariable Integer id){
        Employ employDelete = repEmploy.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employ not exist !!!"));
        repEmploy.delete(employDelete);
        Map<String,Boolean> responseDelete = new HashMap<>();
        responseDelete.put("deleted",true);
        return ResponseEntity.ok(responseDelete);
    }

    //Update an Employ
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Employ> UpdateEmploy(@PathVariable Integer id,@RequestBody Employ employ){
        Employ employUpdate = repEmploy.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employ not exist !!!"));
        employUpdate.setNameEmploy(employ.getNameEmploy());
        employUpdate.setRolEmploy(employ.getRolEmploy());

        Employ employUpdated = repEmploy.save(employUpdate);

    return ResponseEntity.ok(employUpdated);

    }

}
