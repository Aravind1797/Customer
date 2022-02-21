package com.example.demo.repo;

import com.example.demo.modal.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>
{

 //Account findbyAccountId(int accNumber);

}


