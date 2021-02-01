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

    public List<User> getPerson() { return users; }
    public void setPerson(List<User> users) { this.users = users; }

    private static int ID = 0;
    private int lastID;

    public void addPerson(String n,String s,String l){
        User user = new User(n, s, l);
        users.add(user);
        user.setID(dataID());
    }
    public void delPerson(String name) {
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
    // ID's
    public int dataID(){
        ID++;
        this.lastID = ID;
        return lastID;
    }
}
