package com.unidir.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerControl 
{
    @Autowired
    private CustomerServe serve;

    @PostMapping("/post/customer")
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return serve.saveCustomerEntry(customer);
    }

    @PostMapping("post/customers")
    public List<Customer> addCustomers(@RequestBody List<Customer> list)
    {
        return serve.saveListEntry(list);
    }

    @GetMapping("/get/{iden}")
    public Customer getCustomerByID(@PathVariable long iden)
    {
        return serve.getCustomerByID(iden);
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers()
    {
        return serve.getAllCustomers();
    }
}