package com.example.demo.repo;

import com.example.demo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer, String>
{


}
