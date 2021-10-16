package com.bizimkiler.ems.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name", length=30, nullable = false)
    private String firstName;

    @Column(name = "last_name",length=30, nullable = false)
    private String lastName;

    private String email;


}
