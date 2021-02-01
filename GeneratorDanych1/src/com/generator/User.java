package com.generator;

public class User {

    String name;
    String surname;
    String login;
    int id;

    public User(String n, String s, String l, int id) {
        this.name = n;
        this.surname = s;
        this.login = l;
        this.id = id;
    }

    public User(String n, String s, String l) {
        this.name = n;
        this.surname = s;
        this.login = l;
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

    public int getID() { return id; }
    public void setID(int id) { this.id = id; }

}
