package com.enset.digital_banking.entities;

import com.enset.digital_banking.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountOperation {
    private Long id;
    private Date date;
    private double amount;
    private OperationType type;
}
