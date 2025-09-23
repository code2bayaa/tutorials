package Arrays;

public class Student {

    public String Name;
    String ID;
    String Email;
    double fee;
    int isRegistered = 0;
    int Boarding = 0;
    //if boarder == 1

    Student(String name, String ID, String Email){
        this.Name = name;
        this.ID = ID;
        this.Email = Email;
        //not paid == not registered
    }

    Student(String name, String ID, String Email, double fee){
        this.Name = name;
        this.ID = ID;
        this.Email = Email;
        this.fee = fee;
        this.isRegistered = 1;
    }

    Student(String name, String ID, String Email, double fee, int boarding){
        this.Name = name;
        this.ID = ID;
        this.Email = Email;
        this.fee = fee;
        this.isRegistered = 1;
        this.Boarding = boarding;
    }

    //if student not registered isRegistered === 0 : isRegistered === 1
//    public void registerStudent(){
//        this.isRegistered = 1;
//        System.out.println("student is registered");
//    }

    public void getStudent(){
        System.out.println("name: " + this.Name);
        System.out.println("student id: " + this.ID);
        System.out.println("email: " + this.Email);
        System.out.println("fee: " + this.fee);
        System.out.println("registered: " + (this.isRegistered == 1 ? "is true" : "is not true"));
        System.out.println("Day School | Boarding? : " + (this.Boarding == 1 ? "Boarding" : "Day School"));
    }
}
