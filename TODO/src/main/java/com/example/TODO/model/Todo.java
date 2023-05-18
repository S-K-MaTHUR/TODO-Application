package com.example.TODO.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {

    private String id;
    private String todoName;
    private boolean todoStatus;

}
