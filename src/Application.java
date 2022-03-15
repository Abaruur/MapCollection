import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);

        Map<Room, Guest> assignments = new HashMap<>();
        assignments.put(oxford, maria);
        assignments.put(piccadilly, john);

        Set<Map.Entry<Room, Guest>> cv = assignments.entrySet();

        for(Map.Entry<Room, Guest> : assignments.entrySet())
        {
            Room r = entry.getValue();
            Room g = entry.getValue();
            System.out.println("%s : %s%n", r.getName(), g.getFirstName());
        }


    }

}
