package com.example.demo.feign;

import com.example.demo.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="Account",fallbackFactory =HystrixFallbackFactorty.class,configuration = {CustomerRetryClientConfig.class})

public interface AccountFeign  {


    @PostMapping(value ="/AddingAccount")
    public void addAccount(@RequestBody Account account);


        @GetMapping({"/account/id/{id}"})
        Account getIds(@PathVariable Integer id);
}
