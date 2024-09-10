// fnu shruti
// 09/10/2024
import  java.util.ArrayList
public class App {
    public static void main(String[] args) {
        System.out.println("\n\n welcome to the classes and object oriented program!\n");
        student myNewStudent = new student();
        myNewStudent.age = 64;
        myNewStudent.gpa = 3.4;
        myNewStudent.major = "History";
        myNewStudent.firstname = "Fnu";
        myNewStudent.lastname = "Shruti";
        myNewStudent.onprobation = "true";
        // output some stuff about our new object
        System.out.println("\n The first name of our class is :"+ myNewStudent.firstname+"\n\n");
        // create two more students
        student onemorestu = new student();
        onemorestu.major = "history";
        onemorestu.age = 44;
        //how many students
        System.out.println("\nthere were + student.getNumofStudents + student objects created!");
        // create a phone object
        Phone myNewPhone = new Phone();
        myNewPhone.model = "pixel 8";
        myNewPhone.numofcameras = 3;
        System.out.println("\n mynewphone has" + myNewPhone.numofcameras + "cameras!\n");

        ArrayList<>

        }
    }
}