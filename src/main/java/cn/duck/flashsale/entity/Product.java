package cn.duck.flashsale.entity;

import lombok.Data;

@Data
public class Product {

    private Long id;

    private String name;

    private Integer stock;

    private Double price;

}