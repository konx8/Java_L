package com.generator;

import java.util.ArrayList;
import java.util.Random;

public class User {

    String name;
    String surname;
    String login;
    int ID;

    public User(String n, String s, String l) {
        this.name = n;
        this.surname = s;
        this.login = l;
    }
    public User() {

    }
    @Override
    public String toString(){
        return (
                "Name :"+this.getName()+"\n"+
                "Surname: "+ this.getSurname()+"\n"+
                "Login: "+ this.getLogin());
    }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

}
