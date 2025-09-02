package com.cydeo.tests.week12.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String title;
    private  double price;
    private String description;
    private String category;
    private String image;

    private Rating rating;


}
