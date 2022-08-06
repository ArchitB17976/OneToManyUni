package com.unidir.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServe 
{
    @Autowired
    private ProductRepo rep;
    
    // Create ops
    public Product saveProductEntry(Product alpha)
    {
        return rep.saveAndFlush(alpha);
    }

    public List<Product> saveListEntry(List<Product> beta)
    {
        return rep.saveAllAndFlush(beta);
    }
    
    // Read ops
    public Product getProductByID(long gamma)
    {
        return rep.findById(gamma).orElse(null);
    }

    public List<Product> getAllProducts()
    {
        return rep.findAll();
    }
}