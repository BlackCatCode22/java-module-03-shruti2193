// sf 9/19/24
// Main.java.
// Driver file for animal and Hyena class
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Welcome to my zoo program!");
        // open the arriving animals file
        try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("\"C:\\Users\\BE218\\AnimalandHyena\\arrivingAnimals.txt\""));
        String myLine;
        // Read the file one line at a time.
            while ((myLine = bufferedReader.readLine()) !=null) {
    System.out.println(myLine);



            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an animal object
        Animal myAnimalObject = new Animal();

        myAnimalObject.setAge(4);
        // use our new Animal Object.
        System.out.println("\n My animal age is: "+ myAnimalObject.getAge() + " years old");
        // CRATE A HYENA OBJECT
        Hyena myNewHyena = new Hyena();
        // output the age of yeva
        System.out.println("\n The age of our Hyena is "+ myNewHyena.getAge());
        // create a lion object
        Lion mylion = new Lion();
        // make the lion 12 years old
        mylion.setAge(12);
        // output the age of our lion
        System.out.println("\n My Lion is: " + mylion.getAge()+ "years old.");
        // outut number of animals
        System.out.println("\n The number of animals created is : " + Animal.numofanimals);



    }
}