package com.generator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileWriter;
import java.util.ArrayList;

@XmlRootElement
public class Main {

    public static void main(String[] args) throws Exception {



        JAXBContext jaxbContext = JAXBContext.newInstance(People.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        People people = new People();
        people.addPerson("jacek","plasek","mis");
        people.addPerson("jacek2","plasek2","mis2");
        people.addPerson("jacek3","plasek3","mis3");
        people.addPerson("jacek4","plasek4","mis4");


        for (int i = 1; i < 10; i++) {
            User user = new User();
            user.setLogin("login" + i);
            user.setName("name" + i);
            user.setSurname("surname" + i);
            user.setID(people.dataID());
            //people.dataID();
            people.getPerson().add(user);
            jaxbMarshaller.marshal(people, new FileWriter("test.xml"));
            }

        people.upDate(0,"tomek","tomasz","tomcio1");

        people.delPerson("tomek");
        System.out.println(people.readData("tomek"));
        jaxbMarshaller.marshal(people, new FileWriter("test.xml"));

        }
}
