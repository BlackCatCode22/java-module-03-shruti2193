public class student {
    private static int numofstudents = 0;
    public student() {
        numofstudents++;
    }
    public static int getNumofstudents() {
        return numofstudents;
    }

    //give our student class a few fields
    String firstname;
    String lastname;
    String major;
    double gpa;
    int age;
    String onprobation;
}
