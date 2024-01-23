package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity

public class Student {
    @Id
    private String idStudent;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
}
