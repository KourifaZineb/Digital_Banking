package com.enset.digital_banking.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SavingAccount extends BankAccount{

    private double interestRate;
}
