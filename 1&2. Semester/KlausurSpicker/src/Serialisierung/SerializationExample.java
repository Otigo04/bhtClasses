package Serialisierung;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Alice", 30);

        // SERIALISIERUNG
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
        }

        //DESERIALISIERUNG
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println(deserializedPerson);
        }
    }
}

