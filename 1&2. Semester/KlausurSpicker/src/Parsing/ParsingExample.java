package Parsing;

public class ParsingExample {
    public static void main(String[] args) {
        String data = "1,Alice,30\n2,Bob,25\n3,Charlie,35";
        String[] rows = data.split("\\n");

        for (String row : rows) {
            String[] columns = row.split(",");
            int id = Integer.parseInt(columns[0]);
            String name = columns[1];
            int age = Integer.parseInt(columns[2]);

            System.out.printf("ID: %d, Name: %s, Age: %d\n", id, name, age);
        }
    }
}
