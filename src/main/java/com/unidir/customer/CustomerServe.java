package com.unidir.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServe 
{
    @Autowired
    private CustomerRepo rep;
    
    // Create ops
    public Customer saveCustomerEntry(Customer alpha)
    {
        return rep.save(alpha);
    }

    public List<Customer> saveListEntry(List<Customer> beta)
    {
        return rep.saveAll(beta);
    }
    
    // Read ops
    public Customer getCustomerByID(long gamma)
    {
        return rep.findById(gamma).orElse(null);
    }

    public List<Customer> getAllCustomers()
    {
        return rep.findAll();
    }
}