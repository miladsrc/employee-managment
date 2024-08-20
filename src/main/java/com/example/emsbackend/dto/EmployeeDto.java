package com.example.emsbackend.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.example.emsbackend.entity.Employee}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto implements Serializable {
    Long id;
    String firstName;
    String lastName;
    String email;
}