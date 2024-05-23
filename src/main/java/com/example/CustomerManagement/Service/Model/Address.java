package com.example.CustomerManagement.Service.Model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String Street;
    private String city;
    private String state;
    private String zipcode;
}
