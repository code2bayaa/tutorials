package Arrays;

public class TwoDimensional {
    public static void main(String[] args) {
        //ONE DIMENSIONAL
//        String[] Names = {"Brian","Bree"};
//        Names[0] = "Wafula";
////        Names[2] = "Susan"; -- error
//        for(String name:Names){
//            System.out.println("name: " + name);
//        }
//        String[] Names = new String[2];
//
//        Names[0] = "Brian";
//        Names[1] = "Bree";
////        Names[2] = "Susan"; - length error
//        for(String name:Names){
//            System.out.println("name: " + name);
//        }
        //TWO DIMENSIONAL ARRAYS

        String[][] FullNames = {
                {"Brian","Wekesa"},
                {"Bree", "Wafula"}
        };

        for(String[] Names:FullNames){
            System.out.print("Name: ");
            for(String name: Names){
                System.out.print(name + " ");
            }
            System.out.println();

        }
    }
}
