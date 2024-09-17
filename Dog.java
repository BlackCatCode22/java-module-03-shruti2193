public class Dog {
    // create two fields for our dog objects.
    private String getname;
    private int age;
    public void setName(String name) {
        name = name;

    }
    // create a constructor for all the ibjects that will be created with the new " keywords.
    public Dog() {
        System.out.println("/n a dog class is created! this message is from the constructor \n ");

    }

        public Dog(String myName) {
        this.name = myName;
    }
    public Dog(int theAge){
        this.age= theAge;
    }
    // create constructor that accepts two arguments - a string for the name, and an int for age.
    public Dog(String somename,int someAge){
        // assign name and age to oue new object
        this.age = someAge;
        this.name = somename;
    }

}
 public int getAge () {
    return this.age;


 }
 public void setAge(int age){
    age=age;
 }
