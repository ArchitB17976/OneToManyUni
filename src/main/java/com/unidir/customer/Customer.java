package com.unidir.customer;

import java.util.*;
import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.*;

import com.unidir.product.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Entity
@Table(name = "customer_details")
public class Customer 
{
    @Id
    @SequenceGenerator(name = "customer_details_sequence", initialValue = 10000, allocationSize = 1)
    @GeneratedValue(generator = "customer_details_sequence", strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "customer_id")
    private List<Product> products = new ArrayList<>();
}
