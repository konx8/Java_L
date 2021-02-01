package com.generator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileWriter;

@XmlRootElement
public class Main {

    public static void main(String[] args) throws Exception {

        JAXBContext jaxbContext = JAXBContext.newInstance(People.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        People people = new People();
        people.addUser("jacek","plasek","mis");
        people.addUser("jacek2","plasek2","mis2");
        people.addUser("jacek3","plasek3","mis3");
        people.addUser("jacek4","plasek4","mis4");

        for (int i = 1; i < 10; i++) {
            User user = new User();
            people.createUser(user);
            people.getUsers().add(user);
            }

        people.upDate(0,"tomek","tomasz","tomcio1");

        people.delUser("tomek");

        System.out.println(people.readData("tomek"));

        jaxbMarshaller.marshal(people, new FileWriter("test.xml"));
        }
}
