package com.unidir.product;

import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_details")
@Transactional
public class Product 
{
    @Id
    @SequenceGenerator(name = "product_details_sequence", initialValue = 11000, allocationSize = 1)
    @GeneratedValue(generator = "product_details_sequence", strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private int quantity;
}
