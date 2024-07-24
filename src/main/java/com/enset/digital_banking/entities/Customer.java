package com.enset.digital_banking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

    private Long id;
    private String name;
    private String email;
    private List<BankAccount> bankAccounts;
}
