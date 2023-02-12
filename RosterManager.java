import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RosterManager {

    // CHECK THIS incomplete
    public void run() {
        try {
            File texts = new File("Project1TestCases.txt");
            Scanner scan = new Scanner(texts);
            String wows = scan.nextLine();
            System.out.println(wows);
            // while (true) {
            // String wow = scan.nextLine();
            // if (wow.equals("")) {
            // break;
            // }
            // String[] elements = wow.split(" ");
            // if (elements[0].equals("A")) {
            // //use add method
            // Date newDate = new Date(elements[3]);
            // Profile prof = new Profile(elements[2], elements[1], newDate);
            // Student ptr = new Student(prof, elements[4], Integer.parseInt(elements[5]));
            // //A John Doe 9/2/2022 EE 10
            // //0: add 1: First name 2: Last 3: DOB 4: Major 5: Credits
            //
            // } else if (elements[0].toUpperCase().equals("P")) {
            //
            // } else if (elements[0].toUpperCase().equals("PS")) {
            //
            // } else if (elements[0].toUpperCase().equals("PC")) {
            //
            // } else if (elements[0].toUpperCase().equals("R")) {
            //
            // } else if (elements[0].toUpperCase().equals("C")) {
            //
            // } else if (elements[0].toUpperCase().equals("L")) {
            //
            // } else if (elements[0].toUpperCase().equals("Q")) {
            // break;
            // }
            // }
        } catch (FileNotFoundException e) {

        }
    }

}