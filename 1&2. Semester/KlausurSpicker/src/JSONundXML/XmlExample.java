/*
import jakarta.xml.bind.*;
import java.io.*;

@XmlRootElement
class Person {
    public String name;
    public int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class XmlExample {
    public static void main(String[] args) throws JAXBException {
        Person person = new Person("Alice", 30);

        // Serialisierung
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(person, writer);
        System.out.println("XML: \n" + writer);

        // Deserialisierung
        StringReader reader = new StringReader(writer.toString());
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Person deserializedPerson = (Person) unmarshaller.unmarshal(reader);
        System.out.println("Deserialized Person: " + deserializedPerson.name + ", " + deserializedPerson.age);
    }
}
*/
