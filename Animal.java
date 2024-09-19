public class Animal {
    // creae a static int that keep track of the number of the animals created.
    static int numofanimals = 0;
    // ceate a constructor for our new animal objects
    public Animal () {
        numofanimals++;

    }
    //Create a few fields
    // Sex will be male or female
    private String sex = "";
    private int age = 0;
    // weight will be in pounds
    private int weight = 0;
    // Create getters and setters


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

