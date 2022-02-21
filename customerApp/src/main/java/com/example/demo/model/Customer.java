package com.example.demo.model;

import com.example.demo.enums.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.HttpStatus;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Customer")

public class Customer {

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String City;
    private CustomerType customerType;


    public Customer(Customer customer, HttpStatus ok) {
    }
}
