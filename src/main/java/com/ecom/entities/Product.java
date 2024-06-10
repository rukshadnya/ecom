package com.ecom.entities;

import java.sql.Blob;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {


    private Long id;
    private String name;
    private double price;
    private String description;
    private Blob pictureUrl;
}
