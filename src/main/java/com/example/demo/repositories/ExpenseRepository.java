package com.example.demo.repositories;

import com.example.demo.models.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class ExpenseRepository {
    private List<Expense> expenses=new ArrayList<>();
}
