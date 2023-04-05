package com.springproject.userdpt.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;

    public Department() {
    }

}

