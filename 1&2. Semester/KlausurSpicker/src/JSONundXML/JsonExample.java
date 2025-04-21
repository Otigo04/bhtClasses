/*
package JSONundXML;
import java.io.IOException;
import java.util.*;

public class JsonExample {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Serialisierung
        User user = new User("Alice", 30);
        String jsonString = objectMapper.writeValueAsString(user);
        System.out.println("JSON: " + jsonString);

        // Deserialisierung
        User deserializedUser = objectMapper.readValue(jsonString, User.class);
        System.out.println("Deserialized User: " + deserializedUser.name + ", " + deserializedUser.age);
    }
}
*/