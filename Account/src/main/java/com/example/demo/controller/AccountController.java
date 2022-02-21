package com.example.demo.controller;


import com.example.demo.modal.Account;
import com.example.demo.services.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.ws.rs.HttpMethod;
import java.util.List;

@RestController
@RequestMapping("/EntryPoint")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/AccDetails")
    public List<Account> getAccountdetails() {

        return accountService.getAccountdetails();
    }

    @PostMapping("/AddingAccount")
    public void addAccount(@RequestBody Account account) {
        accountService.addAccount(account);

    }


//    @GetMapping("/AccDetailsbyid")
//    public Account getAccountdetails(@PathVariable("accNumber") int accNumber) {
//        return accountService.getAccountById(accNumber);
//    }
}


