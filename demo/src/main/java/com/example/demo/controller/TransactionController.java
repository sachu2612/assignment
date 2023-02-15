package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.IStatistics;
import com.example.demo.model.TransactionModel;
import com.example.demo.servive.TransactionService;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransactionController {
  
  @Autowired
  private TransactionService transactionService;
  
  @PostMapping("/transaction")
  public TransactionModel addTransaction(@RequestBody TransactionModel product) {
      return transactionService.saveProduct(product);
  }

  @DeleteMapping("/delete")
  public String deleteTransaction() {
      return transactionService.deleteTransactions();
  }
  
  @GetMapping("/statistics")
  public IStatistics getStatistics() {
      return transactionService.getStatistics();
  }
}