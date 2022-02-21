package com.example.demo.services;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices
{
   @Autowired
    CustomerRepo customerRepo;


   public List<Customer> getCustomerdetails()
   {

       return customerRepo.findAll();
   }

   public void addCustomer( Customer customer)
              {
                 customerRepo.save(customer);
   }

    public Optional<Customer> findById(Integer id) {
        Optional<Customer> one = customerRepo.findById(id).getId();


    }
}
