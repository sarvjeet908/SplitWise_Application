package com.example.demo.repositories;

import com.example.demo.models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class UserRepository {
    private List<User> users = new ArrayList<>();

  /*  public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }*/
}
