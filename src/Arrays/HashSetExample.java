package Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {
    public static void main(String[] args) {

        //first syntax
        HashSet<Integer> numbers = new HashSet<Integer>();

        //second syntax
        var numbersOne = new HashSet<Integer>();

        //third syntax
        HashSet<Integer> numbersTwo = new HashSet<>();

        Scanner input = new Scanner(System.in);

        System.out.print("What is your size? ");

        int length = input.nextInt();

        for(int x = 0; x < length;x++){
            int newX = x + 1;
            numbers.add(newX);
        }

        System.out.println(numbers);

//        System.out.print("What number do you want to check? ");
//        int askedNumber = input.nextInt();
//
//        if(numbers.contains(askedNumber)){
//            System.out.println(askedNumber + " is inside the set");
//        }else{
//            System.out.println(askedNumber + " is not inside the set");
//        }

        System.out.print("Add an extra number ");
        int rateNumber = input.nextInt();

        numbers.add(rateNumber);

        System.out.println(numbers);


    }
}
