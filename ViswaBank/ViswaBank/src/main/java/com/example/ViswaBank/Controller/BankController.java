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
    //data store
    @PostMapping("/")
    public ResponseEntity<Bank> addEmp(@RequestBody Bank b){
         Bank addEmployee=bankService.addEmp(b);
         if(addEmployee!=null)
             return  new ResponseEntity<Bank>(addEmployee, HttpStatus.CREATED);
         else
             return  new ResponseEntity<Bank>(addEmployee, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    //data retrive all
    @GetMapping("/")
    public List<Bank> getEmployees(){
     List<Bank> getEmployees=bankService.getEmployees();
     return getEmployees;
    }
    //data retrive for single id
    @GetMapping("/{id}")
    public ResponseEntity<Bank> getEmployeeByID(@PathVariable long id){
        Bank getEmployee=bankService.getEmployeeById(id);
        if(getEmployee!=null)
            return new ResponseEntity<Bank>(getEmployee,HttpStatus.FOUND);
        else
            return new ResponseEntity<Bank>(getEmployee,HttpStatus.NOT_FOUND);
    }
    //upadte data using id
    @PutMapping("/{id}")
    public ResponseEntity<Bank> updateEmployeeById(@PathVariable long id){
        Bank updateEmployee=bankService.updateEmployeeByID(id);
        if(updateEmployee!=null)
            return new ResponseEntity<Bank>(updateEmployee,HttpStatus.FOUND);
        else
            return new ResponseEntity<Bank>(updateEmployee,HttpStatus.NOT_FOUND);
    }
    //delete by Id
    @DeleteMapping("/{id}")
    public Boolean deleteEmployeeByID(@PathVariable long id){
        Boolean delEmp=bankService.deleteEmployeeID(id);
        if(delEmp)
            return true;
        else
            return false;
    }

}
