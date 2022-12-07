import java.util.HashMap;
import java.util.Map;
public class Ex1{
    public static void main(String[] args) {
        HashMap<Integer, String> passportToLastName = new HashMap<>();
        passportToLastName.put (123_456, "Иванов");
        passportToLastName.put (321_456, "Васильев");
        passportToLastName.put (234_561, "Петрова");
        passportToLastName.put (234_432, "Иванов");
        passportToLastName.put (654_321, "Петрова");
        passportToLastName.put (345_678, "Иванов");

        System.out.println(passportToLastName);

        String lastName = passportToLastName.get (123_456);
        System.out.println(lastName);

        if (passportToLastName.containsKey(123_456))
            System.out.println("Такой паспорт существует!");

        for (Map.Entry<Integer, String> entry : passportToLastName.entrySet())
            if (entry.getValue().equals("Иванов"))
                System.out.println(entry);
    }
}
