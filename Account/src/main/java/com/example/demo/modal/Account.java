package com.example.demo.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AccountTable")
public class Account {

    @Id
    private int  accNumber;
     private String accType;
    private  int customerId;
  //  private localdate createdDate;
    private String accountBalance;
}
