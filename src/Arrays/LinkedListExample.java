package Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> vehicles = new LinkedList<>();

        vehicles.add("Toyota");
        vehicles.add("Subaru");
        vehicles.add("Nissan");
        vehicles.add("Tesla");

        System.out.println(vehicles);

        vehicles.addFirst("Volvo");

        vehicles.removeLast();

        System.out.println(vehicles);

        //show index againstthe vehicle items
//        for(int x = 0;x < vehicles.size();x++){
//            System.out.println("index: " + x + "vehicle: " + vehicles.get(x));
//        }

        //integer
        //boolean
        //character *** wrapper class ***

        //get access to specific item
//        String vehicleOne = vehicles.get(1);
//        System.out.println("found: " + vehicleOne);
    }
}
