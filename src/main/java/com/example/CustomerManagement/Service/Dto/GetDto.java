package com.example.CustomerManagement.Service.Dto;

import com.example.CustomerManagement.Service.Model.Customer;
import lombok.*;

public class GetDto {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public class UpdateDto {
        private Customer customer;
        private String statusCode;
    }
}
