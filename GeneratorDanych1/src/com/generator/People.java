package com.generator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "People")
@XmlAccessorType (XmlAccessType.FIELD)

public class People {

    List<User> users = new ArrayList<>();

    public List<User> getUsers() { return users; }
    public void setUser(List<User> users) { this.users = users; }

    private static int ID;

    public void addUser(String n,String s,String l){
        User user = new User(n, s, l,dataID());
        users.add(user);
    }
    public void delUser(String name)
    {
        users.removeIf(user -> user.getName().equals(name));
    }
    public void upDate(int x,String n,String s,String l){
        users.get(x).setName(n);
        users.get(x).setSurname(s);
        users.get(x).setLogin(l);
    }
    public User readData(String name){
        for(User user:users){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
    public int dataID(){
        ID++;
        this.ID = ID;
        return ID;
    }
    public void createUser(User user){
        user.setName("name");
        user.setSurname("surname");
        user.setLogin("login");
        user.setID(dataID());
    }


}
