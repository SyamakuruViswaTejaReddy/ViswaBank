package com.example.ViswaBank.Controller;

import com.example.ViswaBank.Entity.Bank;
import com.example.ViswaBank.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping("/")
    public ResponseEntity<Bank> addEmp(@RequestBody Bank b){
         Bank addEmployee=bankService.addEmp(b);
         if(addEmployee!=null)
             return  new ResponseEntity<Bank>(addEmployee, HttpStatus.CREATED);
         else
             return  new ResponseEntity<Bank>(addEmployee, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/")
    public List<Bank> getEmployees(){
     List<Bank> getEmployees=bankService.getEmployees();
     return getEmployees;
    }
}
