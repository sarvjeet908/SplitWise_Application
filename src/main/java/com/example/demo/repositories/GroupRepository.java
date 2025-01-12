package com.example.demo.repositories;

import com.example.demo.models.Group;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class GroupRepository {
    private List<Group> groups=new ArrayList<>();

}
