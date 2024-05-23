package com.example.CustomerManagement.Service.Model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomFields {
    private String birthday;
    private String company;
    private String industry;
    private int leadScore;

}
