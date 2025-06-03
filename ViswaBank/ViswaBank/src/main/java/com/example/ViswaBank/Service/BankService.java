package com.example.ViswaBank.Service;

import com.example.ViswaBank.Entity.Bank;
import com.example.ViswaBank.Repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public Bank addEmp(Bank b) {
        return bankRepository.save(b);
    }

    public List<Bank> getEmployees() {
        return bankRepository.findAll();
    }

    public Bank getEmployeeById(Long id) {
        return bankRepository.findById(id).get();
    }

    public Bank updateEmployeeByID(long id) {
        Bank oldEmp=bankRepository.findById(id).get();
        Bank newEmp=new Bank();
        newEmp.setDesignation(oldEmp.getDesignation());
        newEmp.setEmployeeBranch(oldEmp.getEmployeeBranch());
        newEmp.setEmployeeDepartment(oldEmp.getEmployeeDepartment());
        newEmp.setEmployeeName(oldEmp.getEmployeeName());
        newEmp.setSalary(oldEmp.getSalary());
        return bankRepository.save(newEmp);
    }

    public Boolean deleteEmployeeID(long id) {
        if(bankRepository.existsById(id)) {
            bankRepository.deleteById(id);
            return true;
        }
        else
            return false;
    }
}
