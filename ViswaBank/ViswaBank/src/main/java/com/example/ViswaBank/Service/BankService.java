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
}
