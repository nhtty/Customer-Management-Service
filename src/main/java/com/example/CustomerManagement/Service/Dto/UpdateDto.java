package com.example.CustomerManagement.Service.Dto;

import com.example.CustomerManagement.Service.Model.Customer;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UpdateDto {
    private Customer customer;
    private String message;
    private String statusCode;
}
