package com.example.demo.controller;


import com.example.demo.feign.AccountFeign;
import com.example.demo.model.Customer;
import com.example.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import javax.swing.text.html.Option;
import javax.ws.rs.HttpMethod;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/DashBoard")
public class CustomerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CustomerServices customerServices;

    @Autowired
    AccountFeign accountFiegn;


    @GetMapping("/CustomerDetails")
    public List<Customer> getCustomerdetails()
    {

        return  customerServices.getCustomerdetails();
    }

    @PostMapping("/AddingCustomer")
    public void addCustomer(@RequestBody Customer customer) {
        customerServices.addCustomer(customer);

        getAccount();

//        restTemplate.postForObject(createPersonUrl, request, String.class);
//        {
    }
    @GetMapping("/getAccounts/{id}")
    public String getAccount(){
        //return restTemplate.exchange("http://greet-client/two/Customer",String.class);
        return restTemplate.postForObject("http://Account/EntryPoint/AccDetails",null ,String.class);



//        Customer.setAccount(restTemplate.postForObject("http://localhost:8070/accounts/account", httpEntity, Account.class));
//        customerRepo.save(new Customer(account.getCustomerId(), Customer.getFirstName(), Customer.getLastName(), customer.getPhoneNumber(), customer.getIsCustomerActive(), customer.getAddress(), customer.getCustomerType()));
//        return customer;

    }
    @GetMapping("/id/{id}")
     public Customer getById(@PathVariable("id") Integer id){
        Optional<Customer> one = customerServices.findById(id);
        return new Customer(one.get(), HttpStatus.OK);

    }


    }




