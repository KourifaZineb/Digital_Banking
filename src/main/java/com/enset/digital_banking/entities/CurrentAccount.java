package com.enset.digital_banking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CurrentAccount extends BankAccount{

    private double overDraft;
}
