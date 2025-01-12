package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Expense {
    private String description;
    private Double bill_amount;
    private ExpenseType expenseType;
}
