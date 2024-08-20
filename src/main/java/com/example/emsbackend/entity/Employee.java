package com.example.emsbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME", length =50, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length =50, nullable = false)
    private String lastName;

    @Column(name = "EMAIL_ID", length =100, nullable = false)
    private String email;
}
