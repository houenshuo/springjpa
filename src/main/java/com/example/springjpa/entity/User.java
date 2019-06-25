package com.example.springjpa.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

}
