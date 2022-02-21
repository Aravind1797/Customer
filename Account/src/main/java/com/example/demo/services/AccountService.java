package com.example.demo.services;


import com.example.demo.modal.Account;
import com.example.demo.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService
{
    @Autowired
    AccountRepo accountRepo;


    public List<Account> getAccountdetails()
    {

        return (List<Account>) accountRepo.findAll();
    }

    public void addAccount( Account account)
    {
        accountRepo.save(account);

    }


   public Account getAccountById(int id) {
       return accountRepo.findbyId(id).get();
    }
}


