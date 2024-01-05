package org.bishop.BehaviouralDesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

    private List<User> usersList= new ArrayList<>();

    public UserManagement(List<User> usersList) {
        this.usersList = usersList;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public MyIterator getIterator()
    {
        return new MyIteratorImpl(usersList);
    }
}
