package org.bishop.BehaviouralDesignPattern.IteratorDesignPattern;

public class User {
    private String name;
    private int uiid;
    private String address;

    public User(String name, int uiid, String address) {
        this.name = name;
        this.uiid = uiid;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUiid() {
        return uiid;
    }

    public void setUiid(int uiid) {
        this.uiid = uiid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", uiid=" + uiid +
                ", address='" + address + '\'' +
                '}';
    }
}
