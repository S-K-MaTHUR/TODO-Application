package com.example.TODO.repository;

import com.example.TODO.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepo {

    private List<Todo> todoList;//data source for all our todos

    public TodoRepo()
    {
        todoList = new ArrayList<>() ;
        //not needed ...done for testing
        todoList.add(new Todo("0","Dummy Todo for Testing",true));

    }

    public List<Todo> getTodosFromDataSource()
    {
        return todoList;
    }

    public boolean save(Todo todo)
    {
        todoList.add(todo);//mock Database call
        return true;
    }

    public boolean remove(Todo todo)
    {
        todoList.remove(todo);//mock a database
        return true;
    }

    public boolean update(String id, boolean status)
    {
        boolean updateStatus = false;
        for(Todo todo : todoList)
        {
            if(todo.getId().equals(id))
            {
                //my simple update logic
                //remove original :
                remove(todo);

                //change this todo now
                todo.setTodoStatus(status);

                //add this new todo :
                save(todo);

                //todo.setTodoStatus(status);

                return true;//not mocking the database here to keep things simple.

            }

        }
        return false;
    }

}
