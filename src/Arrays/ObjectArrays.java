package Arrays;

import com.sun.tools.javac.Main;

//[
//        {
//            fee,
//            name,
//            email
//        },...
//                {
//fee,
//name,
//email
//        }
//]
// **** array > student ****

public class ObjectArrays {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        //inserted values
        students[0] = new Student("Peter","2025-09-23-01","peter@example.com");
        students[1] = new Student("Mario","2025-09-23-02","mario@example.com",500000);
        students[2] = new Student("Newton","2025-09-23-03","newton@example.com",900000, 1);

        //display
        for(Student student: students ){
            student.getStudent();
            System.out.println("****************");
            System.out.println();
        }
    }
}
