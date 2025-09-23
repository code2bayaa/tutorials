import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        //1. simple array -- declare values explicitly known
//        String[] Names = {"Brian","Mohad","Bree","Jermaine"};
//
//        for(String name : Names){
//            System.out.println("calling: " + name);
//        }
//
//        int[] Calculator = {1,2,3,4,5};
//        for(int number: Calculator){
//            System.out.println("calculating: " + number);
//        }
        //2. using new keyword
//        String[] Names = new String[4]; //define a length
//        Names[0] = "Brian";
//        Names[1] = "Mohad";
//        Names[2] = "Bree";
//        Names[3] = "Jermaine";
//
//        for(int x = 0;x < Names.length;x++){
//            //x iterates to 4 == length of Names
//            System.out.println("Names: " + Names[x]);
//        }

        System.out.println("How many numbers do you want in the array?");
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        System.out.println("length is: " + length);
        int[] Numbers = new int[length];

        for(int x = 0;x < length; x++){
            int number = x + 1;
            Numbers[x] = number;
        }

        for(int number: Numbers){
            System.out.println("counting: " + number);
        }
//        System.out.print(Numbers);
        //count of 1 to 10

    }
}