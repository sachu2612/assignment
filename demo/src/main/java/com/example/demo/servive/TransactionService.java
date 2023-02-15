package com.example.demo.servive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.IStatistics;
import com.example.demo.model.TransactionModel;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository repository;

    public TransactionModel saveProduct(TransactionModel product) {
        return repository.save(product);
    }

    public String deleteTransactions() {
        repository.deleteAll();
        return "transactions removed !! ";
    }

    public IStatistics getStatistics() {
        return repository.findStatistics();
    }


}
