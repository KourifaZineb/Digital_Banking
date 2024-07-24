package com.enset.digital_banking.entities;

import com.enset.digital_banking.enums.AccountStatus;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BankAccount {

    private String id;
    private Date createdAt;
    private double balance;
    private AccountStatus status;
    private String currency;
    private Customer customer;
    private List<AccountOperation> accountOperations;
}
