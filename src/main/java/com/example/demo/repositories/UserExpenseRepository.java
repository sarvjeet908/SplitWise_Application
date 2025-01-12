package com.example.demo.repositories;

import com.example.demo.models.User_Expenses;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class UserExpenseRepository {
    private List<User_Expenses> userExpenses=new ArrayList<>();
}
