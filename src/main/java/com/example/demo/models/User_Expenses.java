package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User_Expenses {
    private User user;
    private Expense expense;
    private int amount;
    private UserExpenseType userExpenseType;
}
